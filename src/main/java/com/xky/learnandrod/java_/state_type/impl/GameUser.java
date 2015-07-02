package com.xky.learnandrod.java_.state_type.impl;

import com.xky.learnandrod.java_.state_type.IGameAction;
import com.xky.learnandrod.java_.state_type.IRankState;

/**
 * Created by xky on 15/5/29.
 * 游戏中用户角色
 */
public class GameUser implements IGameAction {
    String mUserName;
    IRankState mCurrenState;

    PrimaryState primaryState ;
    SecondaryState secondaryState;
    ProfessionalState professionalState;
    FinalState finalState;
    private int mScore;

    IGameAction mAction ;

    public GameUser(String userName,IGameAction action) {

        mUserName = userName;
        mAction = action;

        initState();
        mCurrenState = primaryState;
    }

    private void initState(){
        primaryState = new PrimaryState(this,mAction);
        secondaryState = new SecondaryState(this,mAction);
        professionalState = new ProfessionalState(this,mAction);
        finalState = new FinalState(this,mAction);

    }

    public void setScore(int score){
        mScore = score;
        mCurrenState.checkState(mScore);
    }

    public void chagneState(IRankState state) {
        mCurrenState = state;
    }



    @Override
    public void playGame() {
        mCurrenState.play();
    }

    @Override
    public void getDoubleScore() {
        mCurrenState.doubleScore();
    }

    @Override
    public void changeCard() {
        mCurrenState.changeCards();
    }

    @Override
    public void peekOtherCard() {
        mCurrenState.peekCards();
    }
}
