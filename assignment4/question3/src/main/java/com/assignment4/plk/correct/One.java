package com.assignment4.plk.correct;


public class One {

    public String gainAccess()
    {
        Two two = new Two();

        return two.getText();
    }

    public String getText()
    {
        Three three = new Three();
        return three.getText();
    }
}
