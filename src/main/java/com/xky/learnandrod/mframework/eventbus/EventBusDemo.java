package com.xky.learnandrod.mframework.eventbus;

import de.greenrobot.event.EventBus;

/**
 * Created by xky on 15/7/1.
 */
public class EventBusDemo {
    public void testRegist(){
        EventBus.getDefault().register(this);
    }

}
