package com.assignment4;

import com.assignment4.Type.TypeOfBird;
import com.assignment4.Type.impl.Eagle;

/**
 * Created by student on 2016/03/15.
 */
public class Runbird {
    public Bird testBird()
    {
        Bird b = new Eagle().getTypeOfBird();
        return b;
    }
}
