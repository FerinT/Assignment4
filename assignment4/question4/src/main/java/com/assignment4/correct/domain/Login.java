package com.assignment4.correct.domain;


import com.assignment4.correct.service.ValidateUser;

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

    public void isValidUser()
    {
        if(ValidateUser.isValid())
            System.out.println("Welcome");
        else
            System.out.println("Invalid username and password");
    }

}
