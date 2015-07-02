package com.xky.learnandrod.java_.command_type;

/**
 * Created by xky on 15/5/27.
 * 抽象接受者
 */
public interface IReceiver {
    /**
     * 具体接受者的逻辑处理[统一处理  如果有自己的逻辑 可以自定义方法]
     */
    public void doit();
}
