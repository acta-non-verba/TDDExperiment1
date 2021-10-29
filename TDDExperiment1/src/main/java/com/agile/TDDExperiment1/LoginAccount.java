package com.agile.TDDExperiment1;

import java.util.Map;

public class LoginAccount {


    public String accountLogin(String username, String password) {
        CreateAccount createAccount = new CreateAccount();
        Map<String,String> userInfo = createAccount.getUserInfo();
        if(userInfo.size()>0){
        if(!username.equals("username"))
            return "Login failed. Invalid username";
        if(!password.equals("12345"))
            return "Login failed. Invalid password";
        return "Login Successful";
    }else
        return "Login Failed";
    
}
    
}
