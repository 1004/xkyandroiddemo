package com.xky.learnandrod.java_.decorate_type.impl;

import com.xky.learnandrod.java_.decorate_type.IEncryptData;
import com.xky.learnandrod.java_.decorate_type.IEncryptDecorate;

/**
 * Created by xky on 15/6/12.
 *
 * 装饰者
 * 求模加密
 */
public class ModeEncryptDecorater implements IEncryptDecorate{
    IEncryptData mEncryptData;

    @Override
    public void setEncryptData(IEncryptData encryptData) {
        mEncryptData = encryptData;
    }

    /**
     * 功能性的增强
     * @param encryptStr
     * @return
     */
    @Override
    public String EncryptData(String encryptStr) {
        String encrypt = encryptStr;
        if(mEncryptData != null){
            encrypt = mEncryptData.EncryptData(encryptStr);
        }
        return "求模加密 --"+encrypt;
    }

}
