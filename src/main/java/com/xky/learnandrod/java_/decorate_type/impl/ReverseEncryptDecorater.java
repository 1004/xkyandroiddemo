package com.xky.learnandrod.java_.decorate_type.impl;

import com.xky.learnandrod.java_.decorate_type.IEncryptData;
import com.xky.learnandrod.java_.decorate_type.IEncryptDecorate;

/**
 * Created by xky on 15/6/12.
 *
 * 装饰者
 * 逆向传输加密
 */
public class ReverseEncryptDecorater implements IEncryptDecorate{
    IEncryptData mEncryptData ;

    @Override
    public void setEncryptData(IEncryptData encryptData) {
        mEncryptData = encryptData;
    }

    @Override
    public String EncryptData(String encryptStr) {
        String encryptD = encryptStr;
        if (mEncryptData != null){
            encryptD = mEncryptData.EncryptData(encryptStr);
        }
        return "逆向传输加密--"+encryptD;
    }
}
