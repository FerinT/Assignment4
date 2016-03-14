package com.assignment4;

import com.assignment4.Factory.FactoryImpl;
import com.assignment4.Type.TypeOfBird;
import com.assignment4.Type.impl.Eagle;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/03/14.
 */
public class TestQuestion1 {

    @Test
    public void testBirdType() throws Exception {
        Runbird r = new Runbird();

        Assert.assertEquals(r.testBird().getColor(), "grey");
    }
}
