package com.xky.learnandrod.java_.iterator_type.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.iterator_type.IIterator;

/**
 * Created by xky on 15/5/27.
 */
public class PagerClient implements Client {
    @Override
    public void test() {
        PagerCollections testCollection = new PagerCollections();
        for (int i = 0 ; i<25;i++){
            testCollection.add("测试"+i);
        }
        IIterator<String> iterator = testCollection.Iterator();
        while (iterator.hasNextPage()) {
            for (String s : iterator.nextPage()) {
                System.out.print(s);
            }

            System.out.println("--------------------");
        }

    }
}
