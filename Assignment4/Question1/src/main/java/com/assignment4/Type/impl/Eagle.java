package com.assignment4.Type.impl;

import com.assignment4.Bird;
import com.assignment4.Factory.FactoryImpl;
import com.assignment4.Type.TypeOfBird;

/**
 * Created by student on 2016/03/14.
 */


public class Eagle implements TypeOfBird{

    public Bird getTypeOfBird() {
        Bird eagle = (Bird)FactoryImpl.buildBird(this);

        return eagle;
    }
}
