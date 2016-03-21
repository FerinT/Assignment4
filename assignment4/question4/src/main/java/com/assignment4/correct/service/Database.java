package com.assignment4.correct.service;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by student on 2016/03/21.
 */
public class Database {

    private ArrayList<String>username = new ArrayList<String>(Arrays.asList("admin", "user"));
    private ArrayList<String>password = new ArrayList<String>(Arrays.asList("admin", "user"));

    public boolean isValid(String username, String password)
    {
        return (this.username.contains(username) & this.password.contains(password));
    }
}
