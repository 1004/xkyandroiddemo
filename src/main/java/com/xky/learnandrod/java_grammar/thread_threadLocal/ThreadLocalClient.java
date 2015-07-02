package com.xky.learnandrod.java_grammar.thread_threadLocal;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/6/15.
 */
public class ThreadLocalClient implements Client{
    @Override
    public void test() {
        threadlocal_demo demo = new threadlocal_demo();
        demo.startTest();

    }
}
