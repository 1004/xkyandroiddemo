package com.xky.learnandrod.java_arit.order_arit;

/**
 * Created by xky on 15/7/2.
 *
 * 可以说是一种模板
 */
public abstract class ABaseOrder implements IOrder{
    public int[] startAOrder(int [] source){
        long beforetime = System.currentTimeMillis();
        int[] dest = startOrder(source);
        long aftertime = System.currentTimeMillis();
        System.out.println("算法执行需要时间"+(aftertime-beforetime));
        return dest;
    }
}
