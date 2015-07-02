package com.xky.learnandrod.java_.state_type.impl;

import com.xky.learnandrod.java_.state_type.IGameAction;
import com.xky.learnandrod.java_.state_type.IRankState;

/**
 * Created by xky on 15/5/29.
 * 终极
 */
public class FinalState implements IRankState{
    GameUser mUser;
    IGameAction mAction;

    public   FinalState(GameUser user,IGameAction action){
        mUser = user;
        mAction = action;
    }

    @Override
    public void checkState(int scroe) {
        if (scroe > 1000){
            System.out.println("我的等级已经到最高了"+scroe);
        }else {
           System.out.println("不要随意降级哦");
        }
    }

    @Override
    public void play() {
        if (mAction != null){
            mAction.playGame();
        }
    }

    @Override
    public void doubleScore() {
        if (mAction != null){
            mAction.getDoubleScore();
        }
    }

    @Override
    public void changeCards() {
        if (mAction != null){
            mAction.changeCard();
        }
    }

    @Override
    public void peekCards() {
        if (mAction != null){
            mAction.peekOtherCard();
        }
    }
}
