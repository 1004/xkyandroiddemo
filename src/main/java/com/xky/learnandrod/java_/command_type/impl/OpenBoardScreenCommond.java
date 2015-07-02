package com.xky.learnandrod.java_.command_type.impl;

import com.xky.learnandrod.java_.command_type.ICommand;
import com.xky.learnandrod.java_.command_type.IReceiver;

/**
 * Created by xky on 15/5/27.
 */
public class OpenBoardScreenCommond implements ICommand {
    private BoardScreen mBoardScreen;
    @Override
    public void setReceiver(IReceiver receiver) {
        mBoardScreen = (BoardScreen) receiver;
    }

    @Override
    public void execute() {
        mBoardScreen.open();
    }
}
