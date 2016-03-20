package com.assignment4;

import com.assignment4.dip.incorrect.Classic;
import com.assignment4.dip.incorrect.MusicPlayer;
import com.assignment4.dip.incorrect.Rap;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/03/20.
 */
public class TestQuestion3Incorrect {
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
}
