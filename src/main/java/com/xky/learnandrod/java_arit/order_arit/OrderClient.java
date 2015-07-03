package com.xky.learnandrod.java_arit.order_arit;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_arit.order_arit.impl.InsertOrder;
import com.xky.learnandrod.java_arit.order_arit.impl.OrderManager;

import java.util.Random;

/**
 * Created by xky on 15/7/2.
 */
public class OrderClient implements Client{
    @Override
    public void test() {
        int length = 1000;
        int [] testSorce = new int[length];
        for (int i = 0 ; i<length ; i++){
            testSorce[i] = getRandom();
        }
        System.out.println("--------排序---");

        //插入排序
        OrderManager.getInstance().startOrder(new InsertOrder(),testSorce);
    }

    public int getRandom(){
        Random r = new Random();
        return r.nextInt(1000);
    }
}
