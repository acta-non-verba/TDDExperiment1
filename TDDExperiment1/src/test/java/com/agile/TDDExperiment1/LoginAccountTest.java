package com.agile.TDDExperiment1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginAccountTest {
    public Map<String,String> userInfo = new HashMap<String,String>();
    @Before
    public void setUp(){
        CreateAccount acc = new CreateAccount();
        acc.accountCreation("username", "12345");
        acc.accountCreation("Ravi", "12345");
        acc.accountCreation("Sasi", "12345");
        acc.accountCreation("Mithra", "12345");
        acc.accountCreation("Nisha123", "12345");
        userInfo = acc.getUserInfo();
    }

    @Test
    public void loginSuccessfullWhenValidUserNameAndPasswordIsPassed(){
        //Arrange 
        LoginAccount loginAcc = new LoginAccount();
        //Act
        String loginMsg = loginAcc.accountLogin("username","12345");
        //Assert
        Assert.assertEquals("Login Successful", loginMsg);
    }

    @Test
    public void loginFailedWhenInvalidUserNameIsPassed(){
        //Arrange
        LoginAccount loginAcc = new LoginAccount();

        //Act
        String loginMsg = loginAcc.accountLogin("joshi","#");
        //Assert
        Assert.assertEquals("Login failed. Invalid username",loginMsg);
    }

    @Test
    public void loginFailedWhenValidUsernameAndInvalidPasswordIsPassed(){
       //Arrange
       LoginAccount loginAcc = new LoginAccount();
       //Act
       String loginMsg = loginAcc.accountLogin("username","#");
       //Assert
       Assert.assertEquals("Login failed. Invalid password",loginMsg);
    }

}
