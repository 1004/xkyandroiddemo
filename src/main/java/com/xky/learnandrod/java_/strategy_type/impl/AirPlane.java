package com.xky.learnandrod.java_.strategy_type.impl;

import com.xky.learnandrod.java_.strategy_type.IPlane;

/**
 * Created by xky on 15/6/6.
 *  客机(AirPlane)

 长距离起飞(LongDistanceTakeOff)

 亚音速飞行(SubSonicFly)
 */
public class AirPlane implements IPlane{


    public AirPlane(){

    }

    @Override
    public void display() {
       System.out.println("客机--长距离起飞--亚音速飞行");
    }
}
