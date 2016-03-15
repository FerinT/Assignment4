package com.assignment4;

import com.assignment4.birdType.impl.Eagle;
import com.assignment4.birdType.impl.Owl;

public class RunBird {


    public Bird testBird()
    {
        Bird b = new Owl().getTypeOfBird();
        return b;
    }
}
