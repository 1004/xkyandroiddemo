package com.xky.learnandrod.java_.factory_type;

/**
 * Created by xky on 15/5/27.
 * 抽象媒体工厂
 *
 * 图片工厂【生产不同格式图片读取器】
 * 视频工厂
 * 音频工厂
 *
 */
public interface IMediaFactory {
    public IMedia createMedia();
}
