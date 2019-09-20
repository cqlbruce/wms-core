#!/bin/sh
cd "`dirname $0`" || returnerr "$0 is not exsit."
readonly INSTANCE_NAME=wms-core
OPER=${1}
SYS_ID=2107

JAVA_HOME=/data/jdk1.8.0_152
DATA_HOME=/data/app
APP_HOME=$DATA_HOME/$INSTANCE_NAME
LOG_DIR=$DATA_HOME/logs/$INSTANCE_NAME
MASTER_OR_SLAVE=master
JAVA_PID=$LOG_DIR/java.pid

CONF_DIR=$APP_HOME/conf
LIB_DIR=$APP_HOME/lib
SYS_DIR=$APP_HOME/apps
WEB_DIR=$APP_HOME/static



SYS_HOST=localhost
JMX_PORT=9080
#SYS_PORT=10010

SYS_MAIN_CLASS=com.hht.wms.core.WmsCoreApplication
COMMAND=shutdown

JAVA_OPTS=" -Dfile.encoding=UTF-8  "
JAVA_OPTS+=" -Dcom.sun.management.jmxremote.port=$JMX_PORT -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false"
JAVA_OPTS+=" -Xmx1024m -Xms1024m -XX:NewRatio=2 -XX:MaxMetaspaceSize=256m -XX:-UseBiasedLocking -XX:CompileThreshold=20000"
JAVA_OPTS+=" -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=70 -XX:+UseCMSInitiatingOccupancyOnly"
JAVA_OPTS+=" -XX:-OmitStackTraceInFastThrow -XX:+ExplicitGCInvokesConcurrent -XX:+ParallelRefProcEnabled"
JAVA_OPTS+=" -XX:+DisableExplicitGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCApplicationStoppedTime -Xloggc:${LOG_DIR}/jvm.log"
JAVA_OPTS+=" -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=${LOG_DIR} -XX:ErrorFile=${LOG_DIR}/java_error_%p.log"
#Custom lib path
export CLASSPATH=$CONF_DIR:$LIB_DIR/*:$SYS_DIR/*:$WEB_DIR
# Restrict glibc thread cache count
export MALLOC_ARENA_MAX=4

#*******fuction define start********
#error return
returnerr()
{
    echo $1
    exit 1
}

# Check start: 0 -> okay, other -> not yet
checkStart()
{
    # ignore stdout/stderr log (e.g. Cannot stat file /proc/xxxx/fd/xxx: No such file or directory)
#    fuser -s $SYS_PORT/tcp > /dev/null 2>&1
#    return $?
	 return 0
}

# Check stop: 0 -> JVM still running, other -> JVM stopped
checkExit()
{
    fuser -s $JMX_PORT/tcp > /dev/null 2>&1
    return $?
}

#help info
help()
{
    echo "Usage: sh ${0} [start|stop|restart|check|startMock]"
    echo "eg: sh ${0} start"
    exit 0
}

#start
start()
{
    #if is running,return
    checkExit
    if [ $? -eq 0 ]; then
        echo "${INSTANCE_NAME} is running! Start aborted."
        return 0
    fi

    echo "${INSTANCE_NAME} begin to start..."
    nohup $JAVA_HOME/bin/java -cp $CLASSPATH -Dwebank.sys.id=${SYS_ID} -Dwebank.sys.name=${INSTANCE_NAME} -Dindex.log.home=${LOG_DIR} \
    ${JAVA_OPTS} ${SYS_MAIN_CLASS} -d ${SYS_HOST} -s ${COMMAND} start >> ${LOG_DIR}/${INSTANCE_NAME}.out 2>&1 &
	echo  $! > $JAVA_PID
	
    echo "${INSTANCE_NAME} pid is: `cat $JAVA_PID`"

    #check
    loopcount=0
    echo -n "Binding server listening port"
    while [ $loopcount -lt 30 ];do
        checkStart
        if [ $? -eq 0 ]; then
            echo " OK!"
            return 0
        else
            echo -n "."
            sleep 1
            loopcount=`expr $loopcount + 1`
        fi
    done
    echo "timeout(30s)!!! Please check log: ${INSTANCE_NAME}.out!"
    return 0
}

#start whith mock server
startMock()
{
    JAVA_OPTS+=" -javaagent:/data/app/avatar/cfpd-avatar-1.0.2.jar=/data/app/avatar/${INSTANCE_NAME}.properties"
    start
}

#stop
stop()
{
    echo "${INSTANCE_NAME} begin to stop..."
    checkExit
    if [ $? -ne 0 ]; then
        echo "${INSTANCE_NAME} isn't running! Stop aborted."
        return 0
    fi

    nohup $JAVA_HOME/bin/java -cp $CLASSPATH -Dwebank.sys.id=${SYS_ID} -Dwebank.sys.name=${INSTANCE_NAME} -Dindex.log.home=${LOG_DIR} \
        ${SYS_MAIN_CLASS} -d ${SYS_HOST} -p ${SYS_PORT} -s ${COMMAND} stop >> ${LOG_DIR}/${INSTANCE_NAME}.out 2>&1 &

    #check
    loopcount=0
    echo -n "Unbinding JMX listening port"
    while [ $loopcount -lt 30 ];do
        checkExit
        if [ $? -ne 0 ]; then
            echo "OK!"
			echo "${INSTANCE_NAME} stoped."
			cat /dev/null>$JAVA_PID
            return 0
        else
            echo -n "."
            sleep 1
            loopcount=`expr $loopcount + 1`
        fi
    done

    echo "timeout(30s)!!! Please check log: ${INSTANCE_NAME}.out!"

    #force quit
    fuser -s -k $JMX_PORT/tcp
    echo "${INSTANCE_NAME} was killed!"
	kill -9 `cat $JAVA_PID`
	echo  "${INSTANCE_NAME} killed success!"
	cat /dev/null>$JAVA_PID
    return 0
}

restart()
{
    stop
    start
    exit 0
}

#check
#return valus: 0-running, 1-not running
check()
{
    checkExit
    if [ $? -eq 0 ]; then
        echo "${INSTANCE_NAME} is running."
        return 1
    else
        echo "${INSTANCE_NAME} isn't running"
        return 0
    fi
}
#*******fuction define end********

#check dir & file
[ -d $LOG_DIR ] || mkdir -p $LOG_DIR || returnerr '$OPER fail: make log dir($LOG_DIR) fail!'
[ -d $DATA_HOME/files/$INSTANCE_NAME ] || mkdir -p $DATA_HOME/files/$INSTANCE_NAME || returnerr '$OPER fail: make files dir($LOG_DIR) fail!'

#do operation
case "${1}" in
start)
    start
    ;;
startMock)
    startMock
    ;;
stop)
    stop
    ;;
restart)
    restart
    ;;
check)
    check
    ;;
*)
    help
    ;;
esac
