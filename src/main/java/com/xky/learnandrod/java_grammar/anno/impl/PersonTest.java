package com.xky.learnandrod.java_grammar.anno.impl;

import com.xky.learnandrod.java_grammar.anno.element.ClassAnnotation;
import com.xky.learnandrod.java_grammar.anno.element.FieldAnnotation;
import com.xky.learnandrod.java_grammar.anno.element.MethodAnnotation;

/**
 * Created by xky on 15/7/3.
 */
@ClassAnnotation(value = "test",logValue = "PersonTest")
public class PersonTest {
    @FieldAnnotation("name")
    private String name;
    @FieldAnnotation("age")
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @MethodAnnotation(name = "plusone",paramscount = 0)
    public void plusOne(){

    }
}
