package com.xky.learnandrod.java_arit.order_arit.impl;

import com.xky.learnandrod.java_arit.order_arit.IOrder;

/**
 * Created by xky on 15/7/2.
 */
public class OrderManager {
    private static OrderManager instance;
    private OrderManager(){};
    public static OrderManager getInstance(){
        if(instance == null){
            instance = new OrderManager();
        }
        return instance;

    }

    public void startOrder(IOrder order,int[] source){
        if (order != null){
            System.out.print("排序前:"+source);

            System.out.print("排序后"+order.startOrder(source));
        }
    }
}
