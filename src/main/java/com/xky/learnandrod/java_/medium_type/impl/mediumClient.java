package com.xky.learnandrod.java_.medium_type.impl;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/6/1.
 */
public class mediumClient implements Client {
    @Override
    public void test() {
        ListSpan span = new ListSpan();
        GraphicSpan graphicSpan = new GraphicSpan();
        TextSpan textSpan = new TextSpan();
        SpanMedium window = new SpanMedium();

        window.addListSpan(span);
        window.addGraphicSpan(graphicSpan);
        window.addTextSpan(textSpan);

        span.clickSpan();
        graphicSpan.clickSpan();
        textSpan.clickSpan();




    }
}
