package com.xky.learnandrod.java_.command_type.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.command_type.ICommand;

/**
 * Created by xky on 15/5/27.
 */
public class CommondClient implements Client{
    @Override
    public void test() {
        Menu menu = new Menu();
        BoardScreen screen = new BoardScreen();
        for (int i = 0 ; i<10 ; i++){
            MenuItem item = new MenuItem("我是"+(i+1));
            int comm = i%3;
            ICommand command = null;

            if(comm == 0){
                command = new OpenBoardScreenCommond();
            }else if(comm == 1){
                command = new CloseBoardScreenCommond();
            }else{
                command = new EditBoardScreenCommond();
            }
            command.setReceiver(screen);
            item.setCommond(command);

            menu.addItem(item);
        }

        menu.testClickAll();



    }
}
