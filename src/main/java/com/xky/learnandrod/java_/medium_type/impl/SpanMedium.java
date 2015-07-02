package com.xky.learnandrod.java_.medium_type.impl;

import com.xky.learnandrod.java_.medium_type.IMedium;
import com.xky.learnandrod.java_.medium_type.ISpan;

/**
 * Created by xky on 15/6/1.
 *
 * 具体span中介【window】
 */
public class SpanMedium implements IMedium {
    ListSpan mListSpan ;
    TextSpan mTextSpan ;
    GraphicSpan mGraphicSpan ;

    public void addListSpan(ListSpan span) {
        if (span == null)
            return;
        mListSpan = span;
        mListSpan.setMedium(this);
    }
    public void addTextSpan(TextSpan span){
        if (span == null)
            return;
        mTextSpan = span;
        mTextSpan.setMedium(this);
    }
    public void addGraphicSpan(GraphicSpan span){
        if (span == null)
            return;
        mGraphicSpan = span;
        mGraphicSpan.setMedium(this);
    }


    /**
     * 测试使用中介者进行交互
     *
     * 但是每个SPAN又和中介耦合太强，可以使用回调解除耦合
     * @param span
     */
    public void Click(ISpan span){
        if (span == null)
            return;
        //引起其他行为的变化
        if(span instanceof ListSpan){
            mTextSpan.operate();//必要判空操作
            mGraphicSpan.operate();
        }else if (span instanceof TextSpan){
            mListSpan.operate();
            mGraphicSpan.operate();
        }else if (span instanceof GraphicSpan){
            mTextSpan.operate();
            mListSpan.operate();
        }
    }

}
