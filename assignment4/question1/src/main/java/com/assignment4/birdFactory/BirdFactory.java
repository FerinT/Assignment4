package com.assignment4.birdFactory;

import com.assignment4.Bird;


public abstract class BirdFactory {

    public static Bird buildBird(String birdType) {

        Bird birdObj = null;

        if(birdType.equalsIgnoreCase("Eagle")) {
            birdObj = new Bird();
            birdObj.setColor("grey");
            birdObj.setFlightSpeed(100);
            birdObj.setWeight(50);
        }

        if(birdType.equalsIgnoreCase("Owl")) {
            birdObj = new Bird();
            birdObj.setColor("grey");
            birdObj.setFlightSpeed(75);
            birdObj.setWeight(25);
        }

        return birdObj;
    }


}
