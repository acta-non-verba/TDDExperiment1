
package com.agile.TDDExperiment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public class CreateAccount {

    Predicate<String> emptyAndNullCheck = uname -> Objects.isNull(uname) || uname.isEmpty();
    private static final Map<String, String> userInfoMap = new HashMap<String, String>();

    public String accountCreation(String userName, String password) {
        String message = validateUsername(userName);
        if (emptyAndNullCheck.test(message))
            message = validatePassword(password);

        if (emptyAndNullCheck.test(message)) {
            addUser(userName, password);
            message = "Account created successfully.";
        }

        return message;
    }

    private String validatePassword(String password) {

        if (emptyAndNullCheck.test(password)) {
            return "Account Creation Failed, password cannot be empty.";
        }
        if (password.length() < 8) {
            return "Account creation failed because password length is less than 8.";
        }
        int alphaCount = getAlphabetCount(password);
        if(alphaCount<2){
             return "Account creation failed because password does not contain at least two alphabets.";
        }
        int digitCount=getDigitCount(password);
        if(digitCount<2){
            return "Account creation failed because password does not contain at least two numbers.";
        }
        return "";
    }

    private int getDigitCount(String password) {
        char[] passwordChars = password.toCharArray();
        var count=0;
        for (char ch : passwordChars) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    private int getAlphabetCount(String password) {
        char[] passwordChars = password.toCharArray();
        var count=0;
        for (char ch : passwordChars) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }

    private String validateUsername(String userName) {

        if (emptyAndNullCheck.test(userName)) {
            return "Account Creation Failed, Username cannot be empty.";
        }
        if (!userName.matches("[a-zA-Z]+")) {
            return "Account creation failed, username should have all alphabets.";
        }
        if (userName.length() > 11 || userName.length() < 2) {
            return "Account creation failed because username length should be less  than 11 and greater than 1.";
        }

        return "";
    }

    private void addUser(String userName, String password) {
        userInfoMap.put(userName, password);
    }

    public Map<String, String> getUserInfo() {
        return userInfoMap;
    }
}
