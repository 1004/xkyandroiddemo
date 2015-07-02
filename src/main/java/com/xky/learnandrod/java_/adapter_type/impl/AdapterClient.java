package com.xky.learnandrod.java_.adapter_type.impl;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/5/28.
 */
public class AdapterClient implements Client{
    @Override
    public void test() {
        OldAdapter moldAdapter = new OldAdapter();
        NewAdapter mNewAdapter = new NewAdapter();
        OperateTextDb textDb = new OperateTextDb();
//        textDb.setEncryAdapter(moldAdapter);
        textDb.setEncryAdapter(mNewAdapter);
        textDb.testOperateEnryDb();
    }
}
