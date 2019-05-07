package com.wucq.springbootdemo.aspect;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * WebLogAspect
 */
@Aspect
@Component
public class WebLogAspect {

    private static final Logger logger=LoggerFactory.getLogger(WebLogAspect.class);

    @Pointcut("execution(public * com.wucq.springbootdemo..controller.*.*(..))")
    public void logPointCut() {
        
    }

    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();

        logger.info("请求地址： "+request.getRequestURI().toString());
        logger.info("HTTP METHOD: "+request.getMethod());
        logger.info("IP: "+request.getRemoteAddr());
        logger.info("CLASS_METHOD:"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logger.info("参数： "+Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret",pointcut = "logPointCut()")
    public void doAfterReturning(Object ret) throws Throwable{
        logger.info("返回值： "+ret);
    }

    @Around("logPointCut()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        long startTime=System.currentTimeMillis();
        Object obj=proceedingJoinPoint.proceed();
        logger.info("耗时："+(System.currentTimeMillis()-startTime));
        return obj;
    }
    
    
}