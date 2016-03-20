package com.assignment4.liskov.incorrect.impl;

import com.assignment4.liskov.incorrect.Shape;

public class Circle implements Shape{
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
    // Invalid, cannot add
    public int getRadius()
    {
        return 2;
    }
}
