package com.xky.learnandrod.java_.strategy_type.impl;

import com.xky.learnandrod.java_.strategy_type.IPlane;

/**
 * Created by xky on 15/6/6.
 * 直升机(Helicopter)

 垂直起飞(VerticalTakeOff)

 亚音速飞行(SubSonicFly)
 */
public class Helicopter implements IPlane{
    @Override
    public void display() {
        System.out.println("直升机--垂直起飞--亚音速飞行");
    }
}
