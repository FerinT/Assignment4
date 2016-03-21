package com.assignment4.liskov.incorrect;

import com.assignment4.liskov.incorrect.impl.Circle;
import com.assignment4.liskov.incorrect.impl.Square;


/**
 * Created by student on 2016/03/21.
 */
public class RunLiskov {

    Shape shape;

    public int getCircleRadius()
    {
        Circle circle = new Circle();
        return circle.getRadius();
    }

    public int getSquareWidth()
    {
         shape = new Square();
        return shape.getWidth();
    }
}
