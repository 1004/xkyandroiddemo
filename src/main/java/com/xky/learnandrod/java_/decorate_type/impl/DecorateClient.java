package com.xky.learnandrod.java_.decorate_type.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.decorate_type.IEncryptData;
import com.xky.learnandrod.java_.decorate_type.IEncryptDecorate;

/**
 * Created by xky on 15/6/12.
 */
public class DecorateClient implements Client{
    @Override
    public void test() {
        IEncryptData encryptData = new CommonEncrypt();//普通
        IEncryptDecorate reverseDecorate = new ReverseEncryptDecorater();//逆向
        IEncryptDecorate modeDecorate = new ModeEncryptDecorater();//求模

        reverseDecorate.setEncryptData(encryptData);//一次增强
        modeDecorate.setEncryptData(reverseDecorate);//二次增强


        System.out.println(modeDecorate.EncryptData("xky"));
    }
}
