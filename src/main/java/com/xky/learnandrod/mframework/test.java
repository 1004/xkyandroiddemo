package com.xky.learnandrod.mframework;

import junit.framework.TestCase;

/**
 * Created by xky on 15/6/24.
 */
public class test extends TestCase{

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("setup");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("tearDown");
         String str = "kkk";
    }

    public void  testAdd(){
       System.out.println("testAdd");
    }

}
