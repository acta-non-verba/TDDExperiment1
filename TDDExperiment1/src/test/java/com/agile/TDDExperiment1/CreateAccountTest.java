package com.agile.TDDExperiment1;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CreateAccountTest {
    @Test
    public void accountCreatedSuccessfullyWhenUsernameandPasswordIsPassed() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("vikas", "ab111111");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void accountCreatedFailsWhenUsernameisEmpty() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("", "2");
        String expected = "Account Creation Failed, Username cannot be empty.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void accountCreatedFailsWhenPasswordIsEmpty() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("username","");
        String expected = "Account Creation Failed, password cannot be empty.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void accountCreationisSuccessfulWhenUserNameContainsAllAlphabets() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("username", "ab111111");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void accountCreationisFailedWhenUserNameContainsNumericCharacter() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("U5ername", "11111111");
        String expected = "Account creation failed, username should have all alphabets.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void accountCreationisFailedWhenUserNameContainsSpecialCharacter() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("U$ername", "11111111");
        String expected = "Account creation failed, username should have all alphabets.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisSuccessfulwhenUsernameLengthisGreaterThanOne() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("us", "ab111111");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisSuccessfulwhenUsernameLengthisSix() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("usernm", "ab111111");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisSuccessfulWhenUserNameLengthisEleven() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("UniqueUserN", "ab111111");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisFailedWhenUserNameLengthisMoreThanEleven() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("UserNameMorethanEleven", "11111111");
        String expected = "Account creation failed because username length should be less  than 11 and greater than 1.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisFailedWhenUsernameLengthisNotGreaterThanOne() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("U", "111111111");
        String expected = "Account creation failed because username length should be less  than 11 and greater than 1.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    /*User story 3*/
    @Test
    public void accountCreationFailsWhenPasswordLengthLessThanEight()
    {
        //Arrange
        CreateAccount acc=new CreateAccount();        
        //Act
        String actual=acc.accountCreation("username", "1234");
        String expected="Account creation failed because password length is less than 8.";
        //Assert        
        assertEquals(expected, actual);
    }
    @Test
    public void accountCreationFailsWhenPasswordContainsLessthanTwoAlphabets()
    {
        //Arrange
        CreateAccount acc=new CreateAccount();        
        //Act
        String actual=acc.accountCreation("username", "p5665641");
        String expected="Account creation failed because password does not contain at least two alphabets.";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void accountCreationFailsWhenPasswordContainsLessthanTwoNumbers()
    {
        //Arrange
        CreateAccount acc=new CreateAccount();        
        //Act
        String actual=acc.accountCreation("username", "AbcDefG1");
        String expected="Account creation failed because password does not contain at least two numbers.";
        //Assert
        assertEquals(expected, actual);
    }
}
