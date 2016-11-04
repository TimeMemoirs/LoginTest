package com.example.timem.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timem on 2016/11/1.
 */

public class LoginFunction {
    private String userName;
    private String userPwd;

    public LoginFunction(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
       // judgeEmail(userName,userPwd);
    }

    public Boolean judgeEmail() {

        String[] splite = this.userName.split("@");
        if (splite.length == 1){
            return false;
        } else {

        }

        return false;
    }

}
