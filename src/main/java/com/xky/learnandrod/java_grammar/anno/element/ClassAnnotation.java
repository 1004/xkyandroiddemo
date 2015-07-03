package com.xky.learnandrod.java_grammar.anno.element;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xky on 15/7/3.
 * 类注解
 * 标注类
 * <p/>
 * 接口、类、枚举、注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//运行时注解
public @interface ClassAnnotation {
    public String value() default "none";
    public String logValue() ;  //都是属性   --- 已（）形式表示
    public enum Type{PERSON,LOG};
}
