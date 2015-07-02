package com.xky.learnandrod.java_grammar.thread_tools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by xky on 15/6/16.
 *
 * 线程池
 */
public class ExcetorTest {
    public void testFixedThreadPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("newFixedThreadPool 测试");
            }
        });
    }
    public void testMulitFixThreadPool(){
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i<10;i ++){
            final int finalI = i;
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread()+",newFixedThreadPool"+ finalI);
                }
            });
        }
    }
    public void testSingleThreadPool(){
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("newSingleThreadExecutor 测试");
            }
        });
    }
    public void testSingleScheduledExecutors(){
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("newSingleThreadScheduledExecutor 测试");
            }
        },1,1, TimeUnit.SECONDS);
    }
    public void testScheduledThreadPool(){
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        for (int i = 0;i <10;i++){
            final int finalI = i;
            service.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread()+"newScheduledThreadPool 测试"+ finalI);
                }
            },1,TimeUnit.SECONDS);
        }
    }



}
