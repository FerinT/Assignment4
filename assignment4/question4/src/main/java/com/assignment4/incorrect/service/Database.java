package com.assignment4.incorrect.service;

import com.assignment4.incorrect.domain.Login;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by student on 2016/03/21.
 */
public class Database {

    private ArrayList<String> username = new ArrayList<String>(Arrays.asList("admin", "user"));
    private ArrayList<String>password = new ArrayList<String>(Arrays.asList("admin", "user"));

    private boolean isValid = false;

    public boolean isValid()
    {
        Login login = new Login();
        return this.username.contains(login.getUsername()) & this.password.contains(login.getPassword());
    }
}
