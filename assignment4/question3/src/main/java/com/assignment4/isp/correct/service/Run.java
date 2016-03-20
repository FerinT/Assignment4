package com.assignment4.isp.correct.service;

import com.assignment4.isp.correct.Car;
import com.assignment4.isp.correct.service.impl.Clio3;
import com.assignment4.isp.correct.service.impl.Mercedes;

/**
 * Created by student on 2016/03/21.
 */
public class Run {
    Car car;

    public void createClio()
    {
        Clio3 clio = new Clio3();
        car = clio.createCar();
        clio.changeGear();
        System.out.println(clio.drive());
    }

    public void createMerc()
    {
        Mercedes merc = new Mercedes();
        car = merc.createCar();
        System.out.println(merc.drive());
    }

}
