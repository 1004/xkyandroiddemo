package com.xky.learnandrod.java_.decorate_type;

/**
 * Created by xky on 15/6/12.
 *
 * 练习

 Sunny软件公司欲开发了一个数据加密模块，可以对字符串进行加密。
 最简单的加密算法通过对字母进行移位来实现，同时还提供了稍复杂的逆向输出加密，
 还提供了更为高级的求模加密。用户先使用最简单的加密算法对字符串进行加密，
 如果觉得还不够可以对加密之后的结果使用其他加密算法进行二次加密，当然也可以进行第三次加密。
 试使用装饰模式设计该多重加密系统。


 装饰模式：
 对原有功能进行增强
 装饰者和被装饰者具有相同的结构
 不然就是策略【算法】或者桥接模式【维度】
 */
public interface IEncryptData {
    /**
     * 为原有者 和装饰者提供方法的抽象
     * @return
     */
    public String EncryptData(String encryptStr);
}
