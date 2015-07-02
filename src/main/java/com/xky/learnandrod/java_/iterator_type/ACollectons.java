package com.xky.learnandrod.java_.iterator_type;

import java.util.List;

/**
 * Created by xky on 15/5/26.
 */
public abstract class ACollectons<T> {
    public abstract void add(T t);

    public abstract void delete(T t);

    public abstract T get(int i);

    public abstract  void addAll(List<T> t);

    public abstract void clear();
}
