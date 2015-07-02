package com.xky.learnandrod.java_.decorate_type.impl;

import com.xky.learnandrod.java_.decorate_type.IEncryptData;

/**
 * Created by xky on 15/6/12.
 *
 * 未被装饰【原生类】
 */
public class CommonEncrypt implements IEncryptData{

    @Override
    public String EncryptData(String encryptStr) {
        return "普通加密字符串--"+encryptStr;
    }
}
