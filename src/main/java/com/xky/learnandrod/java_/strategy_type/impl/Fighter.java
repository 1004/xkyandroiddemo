package com.xky.learnandrod.java_.strategy_type.impl;

import com.xky.learnandrod.java_.strategy_type.IPlane;

/**
 * Created by xky on 15/6/6.
 * 歼击机(Fighter)

 长距离起飞(LongDistanceTakeOff)

 超音速飞行(SuperSonicFly)
 */
public class Fighter implements IPlane{
    @Override
    public void display() {
        System.out.println("歼击机--长距离起飞--超音速飞行");
    }
}
