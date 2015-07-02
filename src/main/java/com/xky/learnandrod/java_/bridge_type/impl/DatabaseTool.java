package com.xky.learnandrod.java_.bridge_type.impl;

import com.xky.learnandrod.java_.bridge_type.IDataBaseType;
import com.xky.learnandrod.java_.bridge_type.IFileType;
import com.xky.learnandrod.java_.bridge_type.ITools;

/**
 * Created by xky on 15/6/11.
 */
public class DatabaseTool implements ITools{
    IDataBaseType mDataBase;
    IFileType mFileType;




    @Override
    public void setDataBaseType(IDataBaseType dataBaseType) {
        mDataBase = dataBaseType;
    }

    @Override
    public void setFiletype(IFileType filetype) {
        mFileType = filetype;
    }

    @Override
    public String convertContent(String text) {
        String fileType = "";
        if (mFileType != null){
             fileType = mFileType.getFileType();
        }
        String dataType = "";
        if(mDataBase != null){
           dataType = mDataBase.getDataBaseType();
        }

        return "数据库："+dataType+"--文件格式："+fileType+"--转换内容："+text;
    }


}
