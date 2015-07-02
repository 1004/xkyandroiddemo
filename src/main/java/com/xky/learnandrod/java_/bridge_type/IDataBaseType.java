package com.xky.learnandrod.java_.bridge_type;

/**
 * Created by xky on 15/6/11.
 *
 * 数据库类型  ---维度
 *
 * 具体业务再子类中实现
 * 如果有公共部分  可以设计模板
 */
public interface IDataBaseType {
    public String getDataBaseType();
}
