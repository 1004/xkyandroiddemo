package com.xky.learnandrod.java_.appearence_type.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.appearence_type.IAppearence;

/**
 * Created by xky on 15/6/2.
 */
public class AppearenceClient implements Client{
    @Override
    public void test() {
        IAppearence appearence = new MachineAppience();
        appearence.clickRedBtn();
        appearence.clickBlueBtn();
        //如果提高扩展性，必须强转为MachineAppiecne;或者将更换功能键提高到接口中
    }
}
