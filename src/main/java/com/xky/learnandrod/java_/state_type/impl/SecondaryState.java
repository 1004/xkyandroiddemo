package com.xky.learnandrod.java_.state_type.impl;

import com.xky.learnandrod.java_.state_type.IGameAction;
import com.xky.learnandrod.java_.state_type.IRankState;

/**
 * Created by xky on 15/5/29.
 * 中级
 */
public class SecondaryState implements IRankState{
    GameUser mUser;
    IGameAction mAction;

    public   SecondaryState(GameUser user,IGameAction action){
        mUser = user;
        mAction = action;
    }

    @Override
    public void checkState(int scroe) {
        if (scroe < 500 && scroe>=100){
            System.out.println("中级");

            return;
        }

        if (scroe >= 500 && scroe<1000){
            //更换状态
            System.out.println("由中级升到高级");

            mUser.chagneState(mUser.professionalState);
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
        System.out.println("中级用户不具备换牌功能哦");

    }

    @Override
    public void peekCards() {
        System.out.println("中级用户不具备偷看功能哦");
    }
}
