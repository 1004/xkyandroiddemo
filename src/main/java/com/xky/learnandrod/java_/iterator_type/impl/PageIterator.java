package com.xky.learnandrod.java_.iterator_type.impl;

import com.xky.learnandrod.java_.iterator_type.IIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xky on 15/5/26.
 * 变换的迭代器
 *
 *
 */
public class PageIterator<T> implements IIterator<T> {
    List<T> mDatas;
    private int mCursor = -1;
    private int page = 10;

    public  PageIterator(List<T> datas){
        this.mDatas = (datas == null ? new ArrayList<T>() : datas);
    }

    @Override
    public List<T> nextPage() {
        mCursor++;
        List<T> tempData = new ArrayList<T>();
        for (int i = mCursor*getPageCount() ; i<mDatas.size() && i<(mCursor+1)*getPageCount();i++){
            tempData.add(mDatas.get(i));
        }
        return tempData;
    }

    @Override
    public boolean hasNextPage() {
        int temp = (mCursor+1)*getPageCount();

        return mDatas.size()>temp;
    }

    @Override
    public List<T> firstPage() {
        mCursor = -1;
        return hasNextPage() ? nextPage() : new ArrayList<T>();
    }


    @Override
    public int getPageCount() {
        return page;
    }
}
