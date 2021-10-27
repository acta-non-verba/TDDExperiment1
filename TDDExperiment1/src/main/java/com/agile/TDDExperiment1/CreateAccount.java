
package com.agile.TDDExperiment1;

import java.util.Objects;
import java.util.function.Predicate;

public class CreateAccount {

    Predicate<String> emptyAndNullCheck = uname -> Objects.isNull(uname) || uname.isEmpty();
    public String accountCreation(String userName, String password) {
        String message = validateUsername(userName);
        if (emptyAndNullCheck.test(message))
            message = validatePassword(password);

        if (emptyAndNullCheck.test(message))
            message = "Account created successfully.";
            
        return message;
    }

    private String validatePassword(String password) {

        if (emptyAndNullCheck.test(password)) {
            return "Account Creation Failed, password cannot be empty.";
        }
        if (!password.matches("^[0-9]+$")) {
            return "Account creation failed because password contains non numeric characters.";
        }
        return "";
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

}
