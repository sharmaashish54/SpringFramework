package com.tight.coupling;

public class UserManager {


    UserDatabase userDatabase = new UserDatabase();//Tight Coupling
    public String getUserInfo(){
        return userDatabase.getUserDetails();


    }
}
