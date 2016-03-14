package com.assignment4.Factory;

import com.assignment4.Bird;
import com.assignment4.Type.TypeOfBird;
import com.assignment4.Type.impl.Eagle;

/**
 * Created by student on 2016/03/14.
 */
public abstract class FactoryImpl{

    public static Bird buildBird(TypeOfBird bird) {

        Bird birdObj = null;

        //if(bird.equals(Eagle.class))
        birdObj = new Bird();
        birdObj.setColor("grey");
        birdObj.setFlightSpeed(100);
        birdObj.setWeight(50);
        return birdObj;
    }


}
