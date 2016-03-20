package com.assignment4.dip.correct.service.impl;

import com.assignment4.dip.correct.service.Genre;

/**
 * Created by student on 2016/03/19.
 */
public class Classics implements Genre{

    public String getGenre() {
        return "this is classic";
    }

    public Genre changeSong(Genre genre) {
        Genre rap = new Rap();
        Genre g;
        if(!(genre.equals(this)))
            g = this;
        else
            g = rap;

        return g;
    }
}
