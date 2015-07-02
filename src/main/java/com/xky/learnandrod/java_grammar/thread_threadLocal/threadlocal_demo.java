package com.xky.learnandrod.java_grammar.thread_threadLocal;

/**
 * Created by xky on 15/6/15.
 *
 * ThreadLocal :
 * 用来解决线程之间数据共享问题
 * 每一个ThreadLocal中都是存储当前线程的变量，线程之间不共享
 * 可以用来多个变量的传递，变量就没必要在形参中传递
 * 如果当前变量是同一个对象，也会造成线程之间对象的共享修改
 * 注意再不使用的时候  进行变量的释放  不然可能会造成OOM
 */
public class threadlocal_demo {
    public static final ThreadLocal<String> Keys = new ThreadLocal<String>();
    public static final ThreadLocal<String> Values = new ThreadLocal<String>();

    public void startTest(){
        for (int i = 0;i < 100; i++){
            final int finalI = i;
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    try {
                        Keys.set(Thread.currentThread()+"Key"+ finalI);
                        Values.set(Thread.currentThread()+"Value"+ finalI);
                        printKV();
                    }finally {
                        Keys.remove();
                        Values.remove();
                    }
                }
            }.start();
        }
    }

    public void printKV(){
        System.out.println(Keys.get());
        System.out.println(Values.get());
    }

}
