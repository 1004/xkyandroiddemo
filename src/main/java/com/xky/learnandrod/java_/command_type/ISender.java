package com.xky.learnandrod.java_.command_type;

/**
 * Created by xky on 15/5/27.
 * 抽象发送者
 *
 */
public interface ISender {
    /**
     * 为发送者设置具体的命令类
     * @param commond
     */
    public void setCommond(ICommand commond);
}
