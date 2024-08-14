package com.loose.coupling;

public class UserDataProvider implements  IUserDataProvider{

    @Override
    public String getUserDetails() {
        //Access Database here
        return "User Details from Database";
    }
}
