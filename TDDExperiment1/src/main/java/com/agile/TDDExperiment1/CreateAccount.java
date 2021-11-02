
package com.agile.TDDExperiment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.*;

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
        //  /(.*[a-z]){3}/i
        //  (?=(.*[a-zA-Z]){2,})
        //[a-zA-Z]{2,}i
        //[A-Z]{2,}i
        //(?=.*[a-z])(?=.*[A-Z])
        String regExpr="^(?=.*[0-9])"+"(?=.*[a-zA-Z]{2}+)";
        Pattern p = Pattern.compile(regExpr);
        Matcher m = p.matcher(password);
        if(!m.matches()){
            return "Account creation failed because password does not contain at least two alphabets.";
        }
        // if (!password.matches("^[0-9]+$")) {
        //     return "Account creation failed because password contains non numeric characters.";
        // }
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

    private void addUser(String userName, String password) {
        userInfoMap.put(userName, password);
    }

    public Map<String, String> getUserInfo() {
        return userInfoMap;
    }
}
