package com.xky.learnandrod.java_grammar.anno.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_grammar.anno.element.ClassAnnotation;
import com.xky.learnandrod.java_grammar.anno.element.FieldAnnotation;
import com.xky.learnandrod.java_grammar.anno.element.MethodAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by xky on 15/7/3.
 */
public class AnnotationClient implements Client{
    @Override
    public void test() {
        PersonTest personTest = new PersonTest();
        ClassAnnotation classAnnotation = personTest.getClass().getAnnotation(ClassAnnotation.class);
        if (classAnnotation != null){
            System.out.println("class 注解" + classAnnotation.value() + "---" + classAnnotation.logValue());
        }
        for (Method method : personTest.getClass().getDeclaredMethods()) {
            MethodAnnotation methodAnnotation = method.getAnnotation(MethodAnnotation.class);
            if (methodAnnotation != null){
                System.out.println("方法注解"+methodAnnotation.name()+"---"+methodAnnotation.paramscount());
            }
        }
        ;

        for (Field field : personTest.getClass().getDeclaredFields()) {
            FieldAnnotation fieldAnnotation = field.getAnnotation(FieldAnnotation.class);
            if (fieldAnnotation != null){
                System.out.println("字段注解"+fieldAnnotation.value());
            }
        }
        ;
    }
}
