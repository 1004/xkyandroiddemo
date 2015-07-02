package com.xky.learnandrod.java_.adapter_type;

/**
 * Created by xky on 15/5/28.
 * <p/>
 * 适配器抽象类【测试 加密算法  解密算法】
 * 可以动态更换适配快
 * 调用者只需要知道执行适配器中的操作，而无需要知道适配器适配的谁
 * <p/>
 * 还有一种场景就是
 * 如果现有模块代码已经有了，并且内部已经调用了现有代码模块中的方法，那么此时就需要
 * 一个适配器进行适配新的模块，由于内部方法已经固定，所以此时适配器应该继承原有代码模块的接口类
 * 然后再接口类中进行新的模块操作
 *
 * 如果现有代码没有面向接口编程 ，那么只能继承该模块，来形成新的适配器，再覆盖逻辑方法，再该方法里面
 * 进行目标行为，所以往往实现目标接口
 */
public interface IBaseAdapter {
    /**加密*/
    public String encryption(String sourceStr);

    /**解密*/
    public String decode(String destStr);
}
