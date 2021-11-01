package com.agile.TDDExperiment1;

import java.util.Map;

public class LoginAccount {

    

    public String accountLogin(String username, String password) {
        CreateAccount createAccount = new CreateAccount();
        Map<String,String> userInfo = createAccount.getUserInfo();
        if(userInfo.size()>0){
        if(!userInfo.containsKey(username))
            return "Login failed. Invalid username";
        else if(!userInfo.get(username).equals(password))
            return "Login failed. Invalid password";
        return "Login Successful";
    }else
        return "Login Failed";
    
}
    
}
