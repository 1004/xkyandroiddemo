package com.xky.learnandrod.java_.memo_type;

/**
 * Created by xky on 15/6/10.
 *
 * 备忘录
 * 用户备份游戏数据
 *
 *
 */
public class Memo {
    private int id;
    private int score;

    public Memo(int id,int score) {
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
