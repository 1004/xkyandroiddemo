package com.xky.learnandrod.java_.iterator_type.impl;

import com.xky.learnandrod.java_.iterator_type.ACollectons;
import com.xky.learnandrod.java_.iterator_type.IIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xky on 15/5/26.
 */
public class PagerCollections extends ACollectons<String>{

    List<String> mDatas;

    public PagerCollections(){
        mDatas = new ArrayList<String>();
    }


    /**
     * 简单工厂方法
     * 创建对象 和使用对象的分离
     *
     * @return
     */
    public IIterator<String> Iterator(){
        return new PageIterator<String>(mDatas);
    }




    @Override
    public void add(String s) {
        mDatas.add(s);
    }

    @Override
    public void delete(String s) {
        mDatas.remove(s);
    }

    @Override
    public String get(int i) {
        return mDatas.get(i);
    }

    @Override
    public void addAll(List<String> t) {
        mDatas.addAll(t);
    }

    @Override
    public void clear() {
        mDatas.clear();
    }
}
