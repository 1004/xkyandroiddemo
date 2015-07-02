package com.xky.learnandrod.java_.adapter_type.impl;

import com.xky.learnandrod.java_.adapter_type.IBaseAdapter;

/**
 * Created by xky on 15/5/28.
 *
 * 新的加密算法
 */
public class NewAdapter implements IBaseAdapter{
    @Override
    public String encryption(String sourceStr) {
        System.out.println("新的加密算法操作"+sourceStr);
        return null;
    }

    @Override
    public String decode(String destStr) {
        System.out.println("新的解密算法操作"+destStr);
        return null;
    }
}
