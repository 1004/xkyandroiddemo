package com.xky.learnandrod.java_.iterator_type;

import java.util.List;

/**
 * Created by xky on 15/5/26.
 * 俺不同的个数的迭代器的抽象接口
 *
 * 数据遍历和集合操作分离
 * 接口分离原则
 *
 */
public interface IIterator<T> {
    public List<T> nextPage();
    public boolean hasNextPage();
    public List<T> firstPage();
    public int getPageCount();
}
