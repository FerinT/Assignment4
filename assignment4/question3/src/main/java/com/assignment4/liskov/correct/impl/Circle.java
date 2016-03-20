package com.assignment4.liskov.correct.impl;

import com.assignment4.liskov.correct.CircularShape;
import com.assignment4.liskov.correct.Shape;

/**
 * Created by student on 2016/03/20.
 */
public class Circle implements Shape, CircularShape {

    @Override
    public int getRadius() {
        return 20;
    }

    public int getArea() {
        return 10;
    }

    @Override
    public int getLength() {
        return 15;
    }

    @Override
    public int getWidth() {
        return 12;
    }
}
