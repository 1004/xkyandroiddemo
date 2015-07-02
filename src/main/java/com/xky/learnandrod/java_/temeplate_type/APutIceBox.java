package com.xky.learnandrod.java_.temeplate_type;

/**
 * Created by xky on 15/6/2.
 *
 * 模板设计
 *
 * 模板设计 往往由以下几个部分
 *
 * 模板方法，抽象方法，具体方法，钩子方法
 * 次序一定【算法】，可能具体操作不同，往往用该设计
 *
 * 冰箱发东西
 * 开门  放东西  关门
 */
public abstract class APutIceBox {
    public void open(){
        System.out.println("开冰箱");
    }

    /**
     * 放东西
     */
    public abstract void put();

    public void close(){
        System.out.println("关冰箱");
    }

    /**
     * 开始放东西了
     */
    public void putSomeThing(){
        open();
        put();
        close();
    }
}
