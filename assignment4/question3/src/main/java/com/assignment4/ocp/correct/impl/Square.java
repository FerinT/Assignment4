package com.assignment4.ocp.correct.impl;

import com.assignment4.ocp.correct.CalculateRadius;

/**
 * Created by student on 2016/03/20.
 */
public class Square implements CalculateRadius {
    int length = 4;
    
    public int calculateRadius() {
        return ((int) Math.sqrt((length * length) / 2));
    }
}
