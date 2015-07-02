package com.xky.learnandrod.java_.appearence_type.impl;

import com.xky.learnandrod.java_.appearence_type.IAppearence;
import com.xky.learnandrod.java_.appearence_type.IOperate;

/**
 * Created by xky on 15/6/2.
 */
public class MachineAppience implements IAppearence {
    IOperate windSystem;
    IOperate fireSystem;
    public MachineAppience() {

        fireSystem = new FireSystem();//默认系统

        windSystem = new WindSystem();
    }

    /**
     * 更换系统功能
     * 提高扩展性
     * @param redOperate
     */
    public void changeRedbtnOperate(IOperate redOperate){
        if (redOperate != null){
            fireSystem = redOperate;
        }
    }
    public void changeBlueBtnOperate(IOperate blueOperate){
        if(blueOperate != null){
            windSystem = blueOperate;
        }
    }


    @Override
    public void clickBlueBtn() {
        if (windSystem != null){
            windSystem.operateSystem();
        }
    }

    @Override
    public void clickRedBtn() {
        if (fireSystem != null){
            fireSystem.operateSystem();
        }
    }


}
