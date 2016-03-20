package com.assignment4;

import com.assignment4.dip.correct.service.MusicPlayer;
import com.assignment4.dip.correct.service.impl.Classics;
import com.assignment4.dip.correct.service.impl.Rap;
import com.assignment4.ocp.correct.RunOCP;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestQuestion3Correct {

    /* Dependancy Tests */

    Classics classics = new Classics();
    Rap rap = new Rap();
    MusicPlayer musicPlayerCorrect = new MusicPlayer();

    @Test
    public void testClassic() throws Exception {
        Assert.assertEquals(musicPlayerCorrect.playClassic().getClass(), classics.getClass());
    }

    @Test
    public void testRap() throws Exception {
        Assert.assertEquals(musicPlayerCorrect.playRap().getClass(), rap.getClass());
    }

    /* OCP Testing */
    RunOCP runocp = new RunOCP();
    @Test
    public void testCircleRadius() throws Exception {
        Assert.assertEquals(runocp.getCircleRadius(), 3);
    }

    @Test
    public void testSquareRadius() throws Exception {
        Assert.assertEquals(runocp.getSquareRadius(), 2);
    }
}
