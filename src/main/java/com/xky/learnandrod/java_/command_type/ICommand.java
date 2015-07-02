package com.xky.learnandrod.java_.command_type;

/**
 * Created by xky on 15/5/27.
 * <p/>
 * 抽象命令类
 *
 *
 * 只有命令才知道接受者是谁
 */
public interface ICommand {
    /**设置具体的接收着*/
    public void setReceiver(IReceiver receiver);

    /***
     * 执行命令
     */
    public void execute();
}
