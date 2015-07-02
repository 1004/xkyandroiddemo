package com.xky.learnandrod.java_.bridge_type;

/**
 * Created by xky on 15/6/11.
 *
 * 练习

 Sunny软件公司欲开发一个数据转换工具，可以将数据库中的数据转换成多种文件格式，
 例如txt、xml、pdf等格式，同时该工具需要支持多种不同的数据库。
 试使用桥接模式对其进行设计。


 抽象工具接口
 桥接模式 往往适用于多维度变换的业务

 分析出变换的维度

 解决使用继承类爆炸
 */
public interface ITools {

    /**
     * 该工具操作的数据库类型
     * 设置维度
     * @param dataBaseType
     */
    public void setDataBaseType(IDataBaseType dataBaseType);

    /**
     * 设置数据库操作的文件类型
     * 设置维度
     * @param filetype
     */
    public void setFiletype(IFileType filetype);

    /**
     * 转换文本
     * @param text
     * @return
     */
    public String convertContent(String text);

}
