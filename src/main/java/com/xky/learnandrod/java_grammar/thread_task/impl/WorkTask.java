package com.xky.learnandrod.java_grammar.thread_task.impl;

import com.xky.learnandrod.java_grammar.thread_task.Task;

/**
 * Created by xky on 15/7/21.
 *
 * 工作线程
 */
public class WorkTask<Params,Progress,Result> extends Task<Params,Progress,Result>{
    @Override
    protected Result onDoBackground(Params... paramses) {
        System.out.println(paramses[0]+"--线程的执行---"+Thread.currentThread().getName());
        return null;
    }
}
