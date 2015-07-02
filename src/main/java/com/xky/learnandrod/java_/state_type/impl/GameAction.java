package com.xky.learnandrod.java_.state_type.impl;

import com.xky.learnandrod.java_.state_type.IGameAction;

/**
 * Created by xky on 15/5/29.
 */
public class GameAction implements IGameAction{
    @Override
    public void playGame() {
        System.out.println("用户玩游戏了");
    }

    @Override
    public void getDoubleScore() {
        System.out.println("用户开启获取双倍积分功能");
    }

    @Override
    public void changeCard() {
        System.out.println("用户开启换牌功能");
    }

    @Override
    public void peekOtherCard() {
        System.out.println("用户开启偷看功能");
    }
}
