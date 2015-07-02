package com.xky.learnandrod.java_.factory_type.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.factory_type.FactoryType;
import com.xky.learnandrod.java_.factory_type.IMediaFactory;

/**
 * Created by xky on 15/5/27.
 */
public class FactoryClient implements Client {
    @Override
    public void test() {
        FactoryManager manager = new FactoryManager();
        IMediaFactory factory = manager.createFactory(FactoryType.IMAGE);
        IMediaFactory factory2 = manager.createFactory(FactoryType.VIDEO);
        factory.createMedia().display();
        factory2.createMedia().display();

    }
}
