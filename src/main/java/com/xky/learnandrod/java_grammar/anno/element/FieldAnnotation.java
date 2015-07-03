package com.xky.learnandrod.java_grammar.anno.element;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xky on 15/7/3.
 * 字段注解
 * 字段、枚举的常量
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldAnnotation {
    public String value() default "";
}
