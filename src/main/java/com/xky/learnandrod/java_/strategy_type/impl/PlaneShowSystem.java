package com.xky.learnandrod.java_.strategy_type.impl;

import com.xky.learnandrod.java_.strategy_type.IPlane;

/**
 * Created by xky on 15/6/6.
 */
public class PlaneShowSystem {
    public void showPlane(IPlane plane){
        if (plane != null){
            plane.display();
        }
    }
}
