package com.xky.learnandrod.java_grammar.thread_tools;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xky on 15/6/17.
 *
 * CountDownLatch:
 * 并发计数器
 * 模拟一个聚餐
 * 朋友从四面八方赶来一块到饭店  人到齐开吃  都吃完后再回家
 */
public class CountDownLatchTest {
    public void testCountDownLatch(){
        int personCount = 10;
        ExecutorService service = Executors.newFixedThreadPool(3);
        final CountDownLatch downLatch = new CountDownLatch(personCount);
        new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    downLatch.await();//阻塞  直到计数器结束
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("人到齐开始吃饭");
            }
        }.start();
        for (int i = 0 ; i<personCount ; i++){
            final int finalI = i;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread()+"报到"+ finalI);
                    downLatch.countDown();
                }
            });
        }
    }
}
