package com.assignment4.factory;

import com.assignment4.domain.Bird;


public abstract class BirdFactory {

    public static Bird buildBird(String birdType) {

        Bird birdObj = null;

        if(birdType.equalsIgnoreCase("Eagle")) {
            birdObj = new Bird();
            birdObj.setColor("grey");
            birdObj.setFlightSpeed(100);
            birdObj.setSpecies("Eagle");
            birdObj.setWeight(50);
        }

        if(birdType.equalsIgnoreCase("Owl")) {
            birdObj = new Bird();
            birdObj.setColor("grey");
            birdObj.setFlightSpeed(75);
            birdObj.setSpecies("Owl");
            birdObj.setWeight(25);
        }

        return birdObj;
    }


}
