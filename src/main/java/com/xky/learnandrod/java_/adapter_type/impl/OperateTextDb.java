package com.xky.learnandrod.java_.adapter_type.impl;

import com.xky.learnandrod.java_.adapter_type.IBaseAdapter;
import com.xky.learnandrod.java_.adapter_type.IOperateTextDb;

/**
 * Created by xky on 15/5/28.
 */
public class OperateTextDb implements IOperateTextDb{
    IBaseAdapter mEncryAdapter = null;


    @Override
    public void setEncryAdapter(IBaseAdapter adapter) {
        mEncryAdapter = adapter;
    }


    public void testOperateEnryDb(){
        if (mEncryAdapter != null){
            mEncryAdapter.encryption("我是内容");
            mEncryAdapter.decode("我是内容");
        }
    }



}
