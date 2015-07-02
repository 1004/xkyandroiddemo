package com.xky.learnandrod.java_.memo_type;

/**
 * Created by xky on 15/6/10.
 *
 * 模拟游戏
 */
public class Game {
   private int score;
   private int id;

    /**
     * 数据恢复
     */
    public void restore(Memo memo){
        this.score = memo.getScore();
        this.id = memo.getId();
    }

   public Memo save(){
    return  new Memo(id,score);
   }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Game{" +
                "score=" + score +
                ", id=" + id +
                '}';
    }
}
