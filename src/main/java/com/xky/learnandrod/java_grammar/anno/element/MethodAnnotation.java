package com.xky.learnandrod.java_grammar.anno.element;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xky on 15/7/3.
 * 方法注解
 *
 * 用来标记方法
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodAnnotation {
    public String name() default "";
    public int paramscount();
}
