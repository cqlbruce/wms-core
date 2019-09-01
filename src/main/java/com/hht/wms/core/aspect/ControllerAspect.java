//package com.hht.wms.core.aspect;
//
//import org.apache.commons.lang3.StringUtils;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.Signature;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import com.alibaba.fastjson.JSON;
//
//
//@Aspect
//@Component
//public class ControllerAspect {
//
//    private static final Logger LOG = LoggerFactory.getLogger(ControllerAspect.class);
//
//    @Pointcut("execution(* com.hht.wms.core..controller..*.*(..))")
//    public void pointCut() {
//    }
//
//    @Around("pointCut()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        Signature sig = pjp.getSignature();
//        String name = StringUtils.join(pjp.getTarget().getClass().getName(), ".", pjp.getSignature().getName());
//        LOG.info("-----【{}】---- 进入API接口... request: 【{}】", name, JSON.toJSON(pjp.getArgs()));
//        try {
//            Object proceed = pjp.proceed();
//            LOG.info("-----【{}】---- 退出API接口... request: 【{}】, response: 【{}】", name, JSON.toJSON(pjp.getArgs()), JSON.toJSON(proceed));
//            return proceed;
//        } catch (Throwable e) {
//            throw e;
//        }
//    }
//
//
//    @Pointcut("execution(* com.wu.sms..controller.admin..*.*(..))")
//    public void pointCutAdmin() {
//    }
//
//    @Around("pointCutAdmin()")
//    public Object aroundAdmin(ProceedingJoinPoint pjp) throws Throwable {
//        Signature sig = pjp.getSignature();
//        String name = StringUtils.join(pjp.getTarget().getClass().getName(), ".", pjp.getSignature().getName());
//        LOG.info("-----【{}】---- 进入后台管理接口... request: 【{}】", name, JSON.toJSON(pjp.getArgs()));
//        try {
//            Object proceed = pjp.proceed();
//            LOG.info("-----【{}】---- 退出后台管理接口... request: 【{}】, response: 【{}】", name, JSON.toJSON(pjp.getArgs()), JSON.toJSON(proceed));
//            return proceed;
//        } catch (Throwable e) {
//            throw e;
//        }
//    }
//
//}
