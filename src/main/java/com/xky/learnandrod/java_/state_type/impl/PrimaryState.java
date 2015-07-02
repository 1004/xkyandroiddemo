package com.xky.learnandrod.java_.state_type.impl;

import com.xky.learnandrod.java_.state_type.IGameAction;
import com.xky.learnandrod.java_.state_type.IRankState;

/**
 * Created by xky on 15/5/29.
 * 初级状态
 */
public class PrimaryState implements IRankState{

    GameUser mUser;
    IGameAction mAction;

    public   PrimaryState(GameUser user,IGameAction action){
        mUser = user;
        mAction = action;
    }

    @Override
    public void checkState(int scroe) {
        if (scroe>0 && scroe<100){
            System.out.println("初级");
            return;
        }

        if (scroe >= 100 && scroe<500){
               //更换状态
            System.out.println("由初级升到中级");

            mUser.chagneState(mUser.secondaryState);
        }else{
            System.out.println("不能越级升级哦");
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
        System.out.println("初级用户不具备双倍积分功能哦，抓紧时间升级哦");
    }

    @Override
    public void changeCards() {
        System.out.println("初级用户不具备换牌功能哦");
    }

    @Override
    public void peekCards() {
        System.out.println("初级用户不具备偷看功能哦");

    }
}
