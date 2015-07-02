package com.xky.learnandrod;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;


public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected Context getContext(){
        return this;
    }
}
