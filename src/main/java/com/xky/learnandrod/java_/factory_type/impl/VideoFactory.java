package com.xky.learnandrod.java_.factory_type.impl;

import com.xky.learnandrod.java_.factory_type.IMedia;
import com.xky.learnandrod.java_.factory_type.IMediaFactory;

/**
 * Created by xky on 15/5/27.
 */
public class VideoFactory implements IMediaFactory{
    @Override
    public IMedia createMedia() {
        return new VideoMedia();
    }
}
