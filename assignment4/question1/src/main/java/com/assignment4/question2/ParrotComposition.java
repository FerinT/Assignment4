package com.assignment4.question2;

import com.assignment4.Bird;
import com.assignment4.birdFactory.BirdFactory;


/* using composition in favour of inheritance */

public class ParrotComposition {
    Bird parrot = BirdFactory.buildBird("Parrot");

    public void setParrotColor(String color)
    {
        parrot.setColor(color);
    }
}
