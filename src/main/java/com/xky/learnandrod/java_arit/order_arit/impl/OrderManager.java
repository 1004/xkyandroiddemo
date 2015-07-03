package com.xky.learnandrod.java_arit.order_arit.impl;

import com.xky.learnandrod.java_arit.order_arit.ABaseOrder;

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

    public void startOrder(ABaseOrder order,int[] source){
        if (order != null){
            System.out.println("排序前:" + printArray(source));

            System.out.println("排序后" + printArray(order.startAOrder(source)));
        }
    }

    public static String printArray(int[] s){
        if(s == null){
            return null;
        }
        for(int i = 0 ; i<s.length ; i++){
            System.out.print(s[i]+" ");
        }
        return "\n";
    }
}
