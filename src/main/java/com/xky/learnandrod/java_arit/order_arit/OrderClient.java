package com.xky.learnandrod.java_arit.order_arit;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_arit.order_arit.impl.InsertOrder;
import com.xky.learnandrod.java_arit.order_arit.impl.OrderManager;

/**
 * Created by xky on 15/7/2.
 */
public class OrderClient implements Client{
    @Override
    public void test() {
        int [] testSorce = {5,2,4,6,1,3};

        //插入排序
        OrderManager.getInstance().startOrder(new InsertOrder(),testSorce);
    }
}
