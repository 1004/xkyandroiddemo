package com.xky.learnandrod.java_.factory_type.impl;

import com.xky.learnandrod.java_.factory_type.FactoryType;
import com.xky.learnandrod.java_.factory_type.IMediaFactory;

/**
 * Created by xky on 15/5/27.
 *
 * 工厂管理器
 *
 * 虽然说是工厂模式，但是该模式中，嵌套了命令设计模式
 * 命令设计：根据不同的命令执行不同的代码
 */
public class FactoryManager {

    public IMediaFactory createFactory(FactoryType factoryType) {
        IMediaFactory factory = new ImageFactory();
        switch (factoryType) {

            case IMAGE:
                factory = new ImageFactory();
                break;
            case VIDEO:
                factory = new VideoFactory();
                break;
        }
        return factory;
    }
}
