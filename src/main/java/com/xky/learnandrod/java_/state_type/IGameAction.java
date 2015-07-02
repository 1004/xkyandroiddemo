package com.xky.learnandrod.java_.state_type;

/**
 * Created by xky on 15/5/29.
 * 游戏中的用户操作
 *
 */
public interface IGameAction {
    public void playGame();
    public void getDoubleScore();
    public void changeCard();
    public void peekOtherCard();
}
