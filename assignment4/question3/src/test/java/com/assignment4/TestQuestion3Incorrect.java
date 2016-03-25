package com.assignment4;

import com.assignment4.dip.incorrect.Classic;
import com.assignment4.dip.incorrect.MusicPlayer;
import com.assignment4.dip.incorrect.Rap;
import com.assignment4.liskov.incorrect.RunLiskov;
import com.assignment4.ocp.incorrect.RunOCP;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestQuestion3Incorrect {

    /* Test DIP */
    MusicPlayer musicPlayer = new MusicPlayer();
    Rap rap = new Rap();
    Classic classic = new Classic();

    @Test
    public void testRap() throws Exception {
        Assert.assertEquals(musicPlayer.playRap().getClass(), rap.getClass());
    }
    @Test
    public void testClassic() throws Exception {
        Assert.assertEquals(musicPlayer.playClassic().getClass(), classic.getClass());
    }

    /* OCP Test */

    @Test
    public void testRadius() throws Exception {
        RunOCP run = new RunOCP();
        Assert.assertEquals(run.getCircle(), 1);
    }

    /* Test Liskov */
    RunLiskov runLiskov = new RunLiskov();
    @Test
    public void testLiskovRadius() throws Exception {
        Assert.assertEquals(runLiskov.getCircleRadius(),2);
    }
    @Test
    public void testLiskovWidth() throws Exception {
        Assert.assertEquals(runLiskov.getSquareWidth(),5);
    }
}
