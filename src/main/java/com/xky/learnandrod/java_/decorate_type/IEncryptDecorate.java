package com.xky.learnandrod.java_.decorate_type;

/**
 * Created by xky on 15/6/12.
 *
 * 装饰者的抽象
 *
 * 仍然具有被装饰者的结构
 */
public interface IEncryptDecorate extends IEncryptData{
    /**
     * 设置装饰的对象
     *
     * 可能具有多次装饰
     */
    public void setEncryptData(IEncryptData encryptData);
}
