package com.assignment4;


// This is inheritance
// You can access public methods and variables with out creating an object
// You can also add your own methods

public class Parrot extends Bird {

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    public String ownersName(String name)
    {
        return "Owners name is " + name;
    }
}
