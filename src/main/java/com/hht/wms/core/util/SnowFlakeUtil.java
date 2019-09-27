package com.hht.wms.core.util;

public class SnowFlakeUtil {

	private static long index=0l ; 
	
	public synchronized static String getNextId(){
		index++ ;
        SnowFlake snowFlake = new SnowFlake(index, index);
        if(index == 30) {
        	index=0 ; 
        }
        try {
        	Thread.sleep(10);	
        }catch(Exception e) {
        	e.printStackTrace();
        }
        return String.valueOf(snowFlake.nextId()) ; 
	}

    public static String getNewNextId() {
        SnowFlake snowFlake = new SnowFlake(2L, 3L);
       int num=(int)(Math.random()*8999)+1000;
        return String.valueOf(snowFlake.nextId())+num ;
    }

    public static String getNextId(long machineId) {
        SnowFlake snowFlake = new SnowFlake(2L, machineId);
        return String.valueOf(snowFlake.nextId()) ;
    }

}
