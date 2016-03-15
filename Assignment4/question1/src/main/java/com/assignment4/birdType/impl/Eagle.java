package com.assignment4.birdType.impl;

import com.assignment4.Bird;
import com.assignment4.factory.BirdFactory;
import com.assignment4.birdType.TypeOfBird;

/**
 * Created by student on 2016/03/14.
 */


public class Eagle implements TypeOfBird{

    public Bird getTypeOfBird() {
        Bird eagle = BirdFactory.buildBird("Eagle");

        return eagle;
    }
}
