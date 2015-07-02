package com.xky.learnandrod.java_.memo_type;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/6/10.
 *
 * 备忘录测试
 */
public class MemoClient implements Client{
    @Override
    public void test() {
        Game g = new Game();

        for (int i = 0;i < 10;i ++){
            g.setId(i);
            g.setScore(i*10);
            System.out.println("操作游戏到"+i);

            MemoManager.getInstance().saveMemo(g.save());
        }
        System.out.println("数据恢复到4");
        g.restore(MemoManager.getInstance().getMemo(3));
        System.out.println(g.toString());

    }
}
