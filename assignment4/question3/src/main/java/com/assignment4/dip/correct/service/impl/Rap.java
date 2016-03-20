package com.assignment4.dip.correct.service.impl;

import com.assignment4.dip.correct.service.Genre;

/**
 * Created by student on 2016/03/19.
 */
public class Rap implements Genre{

    public  String getGenre() {
        return "this is rap";
    }

    public Genre changeSong(Genre genre) {
        Genre classic = new Classics();
        Genre g;
        if(!(genre.equals(this)))
            g = this;
        else
            g = classic;

        return g;
    }
}
