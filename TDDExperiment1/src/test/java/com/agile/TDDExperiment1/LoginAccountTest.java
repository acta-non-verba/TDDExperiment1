package com.agile.TDDExperiment1;

import org.junit.Assert;
import org.junit.Test;

public class LoginAccountTest {
    
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
