package com.xky.learnandrod.java_.factory_type.impl;

import com.xky.learnandrod.java_.factory_type.IMedia;

/**
 * Created by xky on 15/5/27.
 */
public class ImageMedia implements IMedia {
    @Override
    public void display() {
        System.out.println("图片查看");
    }
}
