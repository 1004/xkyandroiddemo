package com.xky.learnandrod.java_.design_type.proxy;

import android.util.Log;

/**
 * Created by xky on 15/5/18.
 * 自定义一种代理模式
 */
public class Proxy_obj implements proxy{
    proxy mProxy;

    public Proxy_obj(proxy pro){
        mProxy = pro;
    }

    public void changeProxy(proxy pro) {
        if (pro == null){
            return;
        }
        mProxy = pro;

    }

    @Override
    public void operation() {
        System.out.println("proxy------before----");
        Log.i("test", "proxy------before----");

        if (mProxy != null){
            mProxy.operation();
        }else {
//            System.out.println("代理真正的类为空了！！");
            Log.i("test", "代理真正的类为空了");
        }

        System.out.println("proxy------after----");
        Log.i("test", "proxy------after----");

    }
}
