package com.assignment4.liskov.incorrect.impl;

import com.assignment4.liskov.correct.Shape;

/**
 * Created by student on 2016/03/20.
 */
public class Square implements Shape {
    public int getArea() {
        return 50;
    }

    @Override
    public int getLength() {
        return 30;
    }

    @Override
    public int getWidth() {
        return 5;
    }
}
