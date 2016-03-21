package com.assignment4.correct.service;

import com.assignment4.correct.domain.Login;

public abstract class ValidateUser {


    public static boolean isValid()
    {
        Login login = new Login();
        Database database = new Database();

        return database.isValid(login.getUsername(), login.getPassword());
    }
}
