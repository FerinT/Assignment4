package com.assignment4.ocp.incorrect;

/**
 * Created by student on 2016/03/20.
 */
public class RunOCP {

    public int getRadius(CalculateRadius calc)
    {
        int radius = 0;
        if(calc.getShapeType().equals("circle"))
            radius = 1;
        else
            radius = 5;
        return radius;
    }
    public int getCircle()
    {
       return getRadius(new Circle());
    }
}
