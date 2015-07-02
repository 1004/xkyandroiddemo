package com.xky.learnandrod.java_.state_type;

/**
 * Created by xky on 15/5/29.
 * <p/>
 * 状态抽象接口
 * <p/>
 * 状态设计：
 * 状态之间的的转换
 * 状态转换的条件，拥有状态的上下文对象，状态操作的具体逻辑
 * 这是使用状态模式的条件
 *
 *
 * 练习

 Sunny软件公司欲开发一款纸牌游戏软件，在该游戏软件中用户角色具有入门级(Primary)、
 熟练级(Secondary)、高手级(Professional)和骨灰级(Final)四种等级，角色的等级与其积分相对应，
 游戏胜利将增加积分，失败则扣除积分。入门级具有最基本的游戏功能play() ，
 熟练级增加了游戏胜利积分加倍功能doubleScore()，高手级在熟练级基础上再增加换牌功能changeCards()，
 骨灰级在高手级基础上再增加偷看他人的牌功能peekCards()。
 试使用状态模式来设计该系统。
 */
public interface IRankState {
    /**
     * 根据积分 由一个状态变为另一个状态
     * @param scroe
     */
    public void checkState(int scroe);

    /**
     * 初级
     */
    public void play();

    /**
     * 中级【双倍积分】
     */
    public void doubleScore();

    /**
     * 高级【换牌】
     */
    public void changeCards();

    /**
     * 骨灰级【偷牌】
     */
    public void peekCards();
}
