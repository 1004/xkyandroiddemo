package com.xky.learnandrod.java_.bridge_type.impl;

import com.xky.learnandrod.java_.bridge_type.IDataBaseType;

/**
 * Created by xky on 15/6/11.
 */
public class SqliteDatabase implements IDataBaseType{
    @Override
    public String getDataBaseType() {
        return "我是sqlite类型";
    }
}
