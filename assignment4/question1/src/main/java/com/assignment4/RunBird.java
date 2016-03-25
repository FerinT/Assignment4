package com.assignment4;

import com.assignment4.birdType.impl.Owl;
import com.assignment4.domain.Bird;

public class RunBird {


    public Bird testBird()
    {
        Bird b = new Owl().getTypeOfBird();
        return b;
    }
}
