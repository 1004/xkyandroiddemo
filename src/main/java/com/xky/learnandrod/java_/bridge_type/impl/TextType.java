package com.xky.learnandrod.java_.bridge_type.impl;

import com.xky.learnandrod.java_.bridge_type.IFileType;

/**
 * Created by xky on 15/6/11.
 *
 * 自己具体的业务 暂时忽略
 */
public class TextType implements IFileType{

    @Override
    public String getFileType() {
        return "我是Text类型";
    }
}
