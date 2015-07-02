package com.xky.learnandrod.java_.adapter_type.impl;

import com.xky.learnandrod.java_.adapter_type.IBaseAdapter;

/**
 * Created by xky on 15/5/28.
 *
 * 案例  旧的加密算法
 */
public class OldAdapter implements IBaseAdapter{
    @Override
    public String encryption(String sourceStr) {
        System.out.println("老的加密算法操作"+sourceStr);

        return null;
    }

    @Override
    public String decode(String destStr) {
        System.out.println("老的解密算法操作"+destStr);

        return null;
    }
}
