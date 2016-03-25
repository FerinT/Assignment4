package com.assignment4.dip.correct.service;

import com.assignment4.dip.correct.service.impl.Classics;
import com.assignment4.dip.correct.service.impl.Rap;

/**
 * Created by student on 2016/03/19.
 */
public class MusicPlayer {

    public Genre playRap()
    {
        return new Rap();
    }
    public  Genre playClassic()
    {
        return new Classics();
    }


}
