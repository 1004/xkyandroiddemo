package com.xky.learnandrod.java_.state_type.impl;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/5/29.
 */
public class GameClient implements Client{
    @Override
    public void test() {
        GameAction action = new GameAction();
        GameUser user = new GameUser("kkk",action);
        for (int i = 1 ; i<=1100 ;){
            user.setScore(i);

            user.playGame();
            user.getDoubleScore();
            user.changeCard();
            user.peekOtherCard();

            i+=50;
        }
    }
}
