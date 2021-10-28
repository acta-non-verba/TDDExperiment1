package com.agile.TDDExperiment1;

public class LoginAccount {

    public String accountLogin(String username, String password) {
        if(!username.equals("username"))
            return "Login failed. Invalid username";
        if(!password.equals("12345"))
            return "Login failed. Invalid password";
        return "Login Successful";
    }
    
}
