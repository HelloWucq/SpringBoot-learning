package com.wucq.springbootdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * AspectDemo
 */
@Aspect
@Order(-99)
@Component
public class AspectDemo {

    @Before("@annotation(test)")
    public void beforeTest(JoinPoint point,TestAnnotation test) throws Throwable{
        System.out.println("beforeTest: "+test.name());
    }

    @After("@annotation(test)")
    public void afterTest(JoinPoint point,TestAnnotation test) {
        System.out.println("afterTest"+test.name());
    }
}