package com.xky.learnandrod.java_grammar.thread_task.impl;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/7/21.
 *
 */
public class WorkClient implements Client
{
    @Override
    public void test() {
        for (int i = 0 ; i<10;i++){
            WorkTask<Integer,Void,Void> task = new WorkTask<Integer,Void,Void>();
            task.execute(i);
        }
    }
}
