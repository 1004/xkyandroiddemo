package com.xky.learnandrod.java_.command_type.impl;

import com.xky.learnandrod.java_.command_type.IItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xky on 15/5/27.
 *
 * 测试 窗口
 */
public class Menu {

    List<IItem> mItems = new ArrayList<IItem>();
    public void addItem(IItem item){
        mItems.add(item);
    }

    public void testClickAll(){
        for (int i = 0 ;i <mItems.size();i++){
            mItems.get(i).onClick();
        }
    }
}
