package com.xky.learnandrod.java_grammar.thread_tools;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/6/17.
 */
public class ToolsClient implements Client{
    @Override
    public void test() {
        ExcetorTest excetorTest = new ExcetorTest();
        SemaphorTest semaphorTest = new SemaphorTest();
        CyclicBarrierTest cyclicBarrierTest = new CyclicBarrierTest();
        CountDownLatchTest countDownLatchTest = new CountDownLatchTest();

//        excetorTest.testScheduledThreadPool();
//        excetorTest.testSingleScheduledExecutors();
//        excetorTest.testMulitFixThreadPool();
//        semaphorTest.testSemapHorTest();
//        cyclicBarrierTest.testBarrier();
        countDownLatchTest.testCountDownLatch();
    }
}
