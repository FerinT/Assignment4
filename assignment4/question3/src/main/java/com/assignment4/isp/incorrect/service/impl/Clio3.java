package com.assignment4.isp.incorrect.service.impl;

import com.assignment4.isp.incorrect.service.DriveCar;

/**
 * Created by student on 2016/03/21.
 */
public class Clio3 implements DriveCar{
    @Override
    public String changeGear() {
        return "changing gear";
    }

    @Override
    public String driveCar() {
        return "driving clio";
    }
}
