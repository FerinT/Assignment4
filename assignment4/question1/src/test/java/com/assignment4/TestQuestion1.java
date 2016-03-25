package com.assignment4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestQuestion1 {
    RunBird runBird = new RunBird();
    @Test
    public void testBirdType() throws Exception {
        Assert.assertEquals(runBird.testBird().getWeight(), 25);
    }
    @Test
    public void testBird() throws Exception {
        Assert.assertTrue(runBird.testBird().getSpecies().equalsIgnoreCase("Owl"));
    }
}
