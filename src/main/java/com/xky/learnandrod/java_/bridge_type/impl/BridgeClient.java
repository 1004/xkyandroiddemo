package com.xky.learnandrod.java_.bridge_type.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.bridge_type.IDataBaseType;
import com.xky.learnandrod.java_.bridge_type.IFileType;
import com.xky.learnandrod.java_.bridge_type.ITools;

/**
 * Created by xky on 15/6/11.
 */
public class BridgeClient implements Client{
    @Override
    public void test() {
        ITools tools = new DatabaseTool();
        //创建原料 -- 维度
        IDataBaseType oracle = new OracleDatabase();
        IDataBaseType sqlite = new SqliteDatabase();
        IFileType txt = new TextType();
        IFileType xml = new XmlType();
        IFileType pdf = new PdfType();

        //使用桥式链接  组合成不同的类型
        tools.setDataBaseType(oracle);
        tools.setFiletype(txt);
        System.out.println(tools.convertContent("select * from table where id like %ll"));

        tools.setDataBaseType(oracle);
        tools.setFiletype(pdf);
        System.out.println(tools.convertContent("select * from table where id like %ll"));

        tools.setDataBaseType(sqlite);
        tools.setFiletype(txt);
        System.out.println(tools.convertContent("select * from table where id like %ll"));

        tools.setDataBaseType(sqlite);
        tools.setFiletype(xml);
        System.out.println(tools.convertContent("select * from table where id like %ll"));
    }
}
