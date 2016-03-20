package com.assignment4.isp.correct.service.impl;

import com.assignment4.isp.correct.Car;
import com.assignment4.isp.correct.service.DriveCar;


public class Mercedes implements DriveCar {

    public Car createCar() {
        Car clio = new Car();
        clio.setMake("merc");
        clio.setTransmission("automatic");
        return clio;
    }
    @Override
    public String drive() {
        return "driving merc";
    }
}
