package com.assignment4.birdType.impl;

import com.assignment4.Bird;

import com.assignment4.birdFactory.BirdFactory;
import com.assignment4.birdType.TypeOfBird;

/**
 * Created by student on 2016/03/15.
 */
public class Owl implements TypeOfBird{

    public Bird getTypeOfBird() {

        Bird owl = BirdFactory.buildBird("Owl");
        return owl;
    }
}
