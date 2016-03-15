package com.assignment4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestQuestion1 {

    @Test
    public void testBirdType() throws Exception {
        RunBird r = new RunBird();

        Assert.assertEquals(r.testBird().getWeight(), 25);
    }
}
