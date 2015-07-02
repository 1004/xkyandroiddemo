package com.xky.learnandrod.java_grammar.thread_tools;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xky on 15/6/16.
 * <p/>
 * /设置parties、count及barrierCommand属性。就是通知上线
 * CyclicBarrier(int):
 * <p/>
 * //当await的数量到达了设定的数量后，首先执行该Runnable对象。
 * CyclicBarrier(int,Runnable):
 * <p/>
 * //通知barrier已完成线程
 * await():
 * 当达到上线后 可以服用await();执行下次循环，到达上线后 仍然会执行 await
 *
 * 处理当并发线程一块执行完后，再执行一个公共操作
 */
public class CyclicBarrierTest {
    private final int COUNT = 5;


    public void testBarrier() {
        final CyclicBarrier barrier = new CyclicBarrier(COUNT,new Runnable() {
            @Override
            public void run() {
                System.out.println("人到齐开始吃饭");
            }
        });

        ExecutorService service = Executors.newFixedThreadPool(COUNT);
        for (int i = 0 ; i <COUNT ; i++){
            final int finalI = i;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("第"+ finalI +"人达到");
                    try {
                        //触发管卡
                        barrier.await();
                        //只有到达触发5个后，每个线程后面的代码才能执行，后面可以继续await，来触发线
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
