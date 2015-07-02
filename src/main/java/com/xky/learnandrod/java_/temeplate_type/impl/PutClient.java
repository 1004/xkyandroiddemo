package com.xky.learnandrod.java_.temeplate_type.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.temeplate_type.APutIceBox;

/**
 * Created by xky on 15/6/2.
 */
public class PutClient implements Client{
    @Override
    public void test() {
        APutIceBox elep = new PutElephant();
        APutIceBox milk = new PutMilk();

        elep.putSomeThing();
        milk.putSomeThing();
    }
}
