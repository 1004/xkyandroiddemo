package com.xky.learnandrod.java_.command_type.impl;

import com.xky.learnandrod.java_.command_type.IReceiver;

/**
 * Created by xky on 15/5/27.
 *
 * 操作面板  相当于接受者
 */
public class BoardScreen implements IReceiver{
    @Override
    public void doit() {
        System.out.println("doit");
    }

    public void open(){
        System.out.println("open");
    }

    public void close(){
        System.out.println("close");
    }
    public void edit(){
        System.out.println("edit");
    }
}
