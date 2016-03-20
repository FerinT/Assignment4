package com.assignment4.liskov.correct.impl;

import com.assignment4.liskov.correct.Shape;

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
