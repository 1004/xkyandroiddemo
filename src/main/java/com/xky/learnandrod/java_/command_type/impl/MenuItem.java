package com.xky.learnandrod.java_.command_type.impl;

import com.xky.learnandrod.java_.command_type.ICommand;
import com.xky.learnandrod.java_.command_type.IItem;
import com.xky.learnandrod.java_.command_type.ISender;

/**
 * Created by xky on 15/5/27.
 * <p/>
 * 窗口中的功能键
 */
public class MenuItem implements ISender, IItem {
    private String mMenuName;
    private ICommand mCommand;
    public MenuItem(String name ) {
        this.mMenuName = name;
    }

    @Override
    public void setCommond(ICommand commond) {
        this.mCommand = commond;
    }


    @Override
    public void onClick() {
        System.out.println("点击了"+mMenuName);
        this.mCommand.execute();
    }
}
