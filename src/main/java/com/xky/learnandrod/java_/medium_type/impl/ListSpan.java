package com.xky.learnandrod.java_.medium_type.impl;

import com.xky.learnandrod.java_.medium_type.IMedium;
import com.xky.learnandrod.java_.medium_type.ISpan;

/**
 * Created by xky on 15/6/1.
 *
 * 测试  Span
 */
public class ListSpan implements ISpan{

    SpanMedium mMedium;

    @Override
    public void setMedium(IMedium medium) {
        mMedium = (SpanMedium) medium;
    }

    public void clickSpan(){
        if (mMedium != null){
            System.out.println("ListSpan 点击");

            mMedium.Click(this);
        }
    }

    public void operate(){
        System.out.println("listsapn 动态操作");
    }
}
