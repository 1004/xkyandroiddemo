package com.xky.learnandrod.java_.state_type.impl;

import com.xky.learnandrod.java_.state_type.IGameAction;
import com.xky.learnandrod.java_.state_type.IRankState;

/**
 * Created by xky on 15/5/29.
 *
 * 高级
 */
public class ProfessionalState implements IRankState{
    GameUser mUser;
    IGameAction mAction;

    public   ProfessionalState(GameUser user,IGameAction action){
        mUser = user;
        mAction = action;
    }

    @Override
    public void checkState(int scroe) {
        if (scroe < 1000 && scroe>=500){
            System.out.println("高级");

            return;
        }
        if (scroe >= 1000){
            //更换状态
            System.out.println("由高级升到骨灰级");

            mUser.chagneState(mUser.finalState);
        }else {
            System.out.println("不能越级升级哦，或者分值有误");
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
        System.out.println("高级用户不具备偷看功能哦");
    }
}
