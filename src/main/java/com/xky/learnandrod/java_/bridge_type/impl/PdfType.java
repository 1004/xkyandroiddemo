package com.xky.learnandrod.java_.bridge_type.impl;

import com.xky.learnandrod.java_.bridge_type.IFileType;

/**
 * Created by xky on 15/6/11.
 */
public class PdfType implements IFileType{
    @Override
    public String getFileType() {
        return "我是pdf类型";
    }
}
