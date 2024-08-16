package com.ioc.coupling;

public class UserDataProvider implements IUserDataProvider {

    @Override
    public String getUserDetails() {
        //Access Database here
        return "User Details from Database";
    }
}
