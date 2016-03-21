package com.assignment4;

import com.assignment4.correct.domain.Login;
import com.assignment4.correct.service.ValidateUser;

import com.assignment4.incorrect.service.Database;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestQuestion4 {
    @Test
    public void testValidateUser() throws Exception {
        Assert.assertTrue(ValidateUser.isValid());
    }

    @Test
    public void testNameForNull() throws Exception {
        Login login = new Login();
        Assert.assertNotNull(login.getUsername());
    }

    /* incorrect version */

    @Test
    public void testValidUser() throws Exception {
        Database database = new Database();
        Assert.assertTrue(database.isValid());
    }

    @Test
    public void testUsername() throws Exception {
        com.assignment4.incorrect.domain.Login login = new com.assignment4.incorrect.domain.Login();
        Assert.assertNotNull(login.getUsername());
    }

    @Test
    public void testMsg() throws Exception {
        com.assignment4.incorrect.domain.Login login = new com.assignment4.incorrect.domain.Login();
        Assert.assertEquals(login.isValidUser(), "Welcome");
    }
}
