package com.assignment4.ocp.correct;

import com.assignment4.ocp.correct.impl.Circle;
import com.assignment4.ocp.correct.impl.Square;

/**
 * Created by student on 2016/03/20.
 */
public class RunOCP {
    CalculateRadius calc;

    public int getSquareRadius()
    {
        calc = new Square();
        return calc.calculateRadius();
    }

    public int getCircleRadius()
    {
        calc = new Circle();
        return calc.calculateRadius();
    }
}
