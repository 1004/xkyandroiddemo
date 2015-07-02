package com.xky.learnandrod.java_grammar.thread_tools;

import android.os.SystemClock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by xky on 15/6/16.
 *
 * 信号量
 * 拥有信号量  释放信号量 来控制线程的占用
 * 当信号量用完只能等待
 */
public class SemaphorTest {
    private static final Semaphore MAXSEMAPHORE = new Semaphore(10);
    public void testSemapHorTest(){
        ExecutorService service = Executors.newFixedThreadPool(50);
        for (int i = 0 ;i <100 ;i ++){
            final int finalI = i;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    boolean acq = false;
                    try {
                        //线程拥有信号量
                        MAXSEMAPHORE.acquire();
                        acq = true;
                        System.out.println(Thread.currentThread()+"testSemapHorTest"+ finalI);
                        SystemClock.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        //当拥有的时候 必须释放
                        if (acq){
                            MAXSEMAPHORE.release();
                        }
                    }
                }
            });
        }
    }
}
