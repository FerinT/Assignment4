package com.assignment4.isp.correct.service.impl;

import com.assignment4.isp.correct.Car;
import com.assignment4.isp.correct.service.ChangeGear;
import com.assignment4.isp.correct.service.DriveCar;


public class Clio3 implements ChangeGear, DriveCar {

    public Car createCar() {
        Car clio = new Car();
        clio.setMake("clio");
        clio.setTransmission("manual");
        return clio;
    }

    public String drive() {
        return "driving clio";
    }

    public String changeGear() {
        return "change gear";
    }
}
