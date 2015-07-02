package com.xky.learnandrod.java_.strategy_type.impl;

import com.xky.learnandrod.java_.strategy_type.IPlane;

/**
 * Created by xky on 15/6/6.
 * 鹞式战斗机(Harrier)

 垂直起飞(VerticalTakeOff)

 超音速飞行(SuperSonicFly)
 */
public class Harrier implements IPlane {
    @Override
    public void display() {
       System.out.println("鹞式战斗机--垂直起飞--超音速飞行");
    }
}
