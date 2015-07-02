package com.xky.learnandrod.java_.strategy_type.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.strategy_type.IPlane;

/**
 * Created by xky on 15/6/6.
 */
public class StrategyClient implements Client{
    @Override
    public void test() {
        IPlane plane = new AirPlane();
        IPlane plane2 = new Fighter();
        IPlane plane3 = new Harrier();
        IPlane plane4 = new Helicopter();

        PlaneShowSystem showSystem = new PlaneShowSystem();
        showSystem.showPlane(plane);
        showSystem.showPlane(plane2);
        showSystem.showPlane(plane3);
        showSystem.showPlane(plane4);
    }
}
