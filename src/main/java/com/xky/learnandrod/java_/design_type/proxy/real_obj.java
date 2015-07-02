package com.xky.learnandrod.java_.design_type.proxy;

/**
 * Created by xky on 15/5/18.
 */
public class real_obj implements proxy{
    @Override
    public void operation() {
        System.out.println("真正的对象执行了");
    }
}
