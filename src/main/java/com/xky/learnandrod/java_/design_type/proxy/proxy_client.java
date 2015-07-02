package com.xky.learnandrod.java_.design_type.proxy;

import android.util.Log;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/5/18.
 */
public class proxy_client implements Client {
    public proxy_client(){

    };


    @Override
    public void test() {

        Proxy_obj pro = new Proxy_obj(new proxy() {
            @Override
            public void operation() {
//                System.out.println("执行了");
                Log.i("test", "被代理类执行了");

            }

        });
        pro.operation();
    }
}
