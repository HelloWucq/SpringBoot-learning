package com.wucq.springbootdemo.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestAnnotation{
    String name() default "默认注解信息";
    String getFieldValue() default "getField";
    String setFieldValue() default "setField";
}