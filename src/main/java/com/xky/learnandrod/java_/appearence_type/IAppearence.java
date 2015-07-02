package com.xky.learnandrod.java_.appearence_type;

/**
 * Created by xky on 15/6/2.
 *
 * 抽象外观
 *
 * 只提供对外操作接口
 * 可以扩充外观
 */
public interface IAppearence {
    /**
     * 红色按钮
     */
    public void clickBlueBtn();

    /**
     * 蓝色按钮
     */
    public void clickRedBtn();
}
