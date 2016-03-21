package com.assignment4.incorrect.domain;

import com.assignment4.incorrect.service.Database;

public class Login {
    private String username = "admin";
    private String password = "admin";

    public String getUsername()
    {
        return  username;
    }

    public String getPassword()
    {
        return password;
    }

    public String isValidUser()
    {
        String msg;

        Database database = new Database();

        if(database.isValid())
            msg = "Welcome";
        else
            msg = "Invalid user!";
        return msg;
    }

}
