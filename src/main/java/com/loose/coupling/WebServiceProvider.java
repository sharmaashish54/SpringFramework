package com.loose.coupling;

public class WebServiceProvider implements  IUserDataProvider{
    @Override
    public String getUserDetails() {
        return "get user details from web service provider";
    }
}
