package com.assignment4.liskov.correct;

import com.assignment4.liskov.correct.impl.Circle;
import com.assignment4.liskov.correct.impl.Square;

/**
 * Created by student on 2016/03/21.
 */
public class RunLiskov {

    public int getRadius()
    {
        CircularShape circle = new Circle();
        return circle.getRadius();
    }

    public int getArea()
    {
        Shape square = new Square();
        return square.getArea();
    }
}
