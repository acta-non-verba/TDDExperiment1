package com.agile.TDDExperiment1;

import org.junit.Assert;
import org.junit.Test;

public class CreateAccountTest {
    @Test
    public void accountCreatedSuccessfullyWhenUsernameandPasswordIsPassed() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("vikas", "34234");
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
        String actual = acc.accountCreation("username", "");
        String expected = "Account Creation Failed, password cannot be empty.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void accountCreationisSuccessfulWhenUserNameContainsAllAlphabets() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("username", "12");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void accountCreationisFailedWhenUserNameContainsNumericCharacter() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("U5ername", "12");
        String expected = "Account creation failed, username should have all alphabets.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void accountCreationisFailedWhenUserNameContainsSpecialCharacter() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("U$ername", "12");
        String expected = "Account creation failed, username should have all alphabets.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisSuccessfulwhenUsernameLengthisGreaterThanOne() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("us", "12");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisSuccessfulwhenUsernameLengthisSix() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("usernm", "123456");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisSuccessfulWhenUserNameLengthisEleven() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("UniqueUserN", "12");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisFailedWhenUserNameLengthisMoreThanEleven() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("UserNameMorethanEleven", "12");
        String expected = "Account creation failed because username length should be less  than 11 and greater than 1.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationisFailedWhenUsernameLengthisNotGreaterThanOne() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("U", "2");
        String expected = "Account creation failed because username length should be less  than 11 and greater than 1.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationSuccessFullwhenPasswordIsAllNumerals() {
        // Arrange
        CreateAccount acc = new CreateAccount();
        // Act
        String actual = acc.accountCreation("username", "1234");
        String expected = "Account created successfully.";
        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AccountCreationFailsWhenPasswordContaintsNonNumericCharacters()
    {
         // Arrange
         CreateAccount acc = new CreateAccount();
         // Act
         String actual = acc.accountCreation("username", "p");
         String expected = "Account creation failed because password contains non numeric characters.";
         // Assert
         Assert.assertEquals(expected, actual);
    }
}
