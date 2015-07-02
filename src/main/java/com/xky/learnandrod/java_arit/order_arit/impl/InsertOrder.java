package com.xky.learnandrod.java_arit.order_arit.impl;

import com.xky.learnandrod.java_arit.order_arit.ABaseOrder;

/**
 * Created by xky on 15/7/2.
 * 插入排序
 */
public class InsertOrder extends ABaseOrder{
    @Override
    public int[] startOrder(int[] source) {


        for (int i = 0 ; source != null && i<source.length ; i++){
              int key = source[i];//先拿到排序牌

              //和手里的牌比较
              for (int j = i-1 ; j>0 ; j--){
                  //如果手里的牌大于拿到的牌 继续
                if (source[j] > key){
                    int temp = source[j];
                    source[j] = key;
                    source[i] = source[j];
                    continue;
                }

                  //仍然是最大牌 顺序不变
                if (source[j] <= key){
                    break;
                }

              }
        }




        return source;
    }
}
