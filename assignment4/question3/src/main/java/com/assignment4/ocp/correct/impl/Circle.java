package com.assignment4.ocp.correct.impl;

import com.assignment4.ocp.correct.CalculateRadius;

/**
 * Created by student on 2016/03/20.
 */
public class Circle implements CalculateRadius {

    public int calculateRadius() {
        int diameter = 6;
        return diameter/2;
    }
}
