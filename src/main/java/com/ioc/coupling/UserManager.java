package com.ioc.coupling;


public class UserManager {
    private IUserDataProvider userDataProvider;

    public UserManager(IUserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    //UserDatabase userDatabase = new UserDatabase();//Tight Coupling
    public String getUserInfo() {
        return userDataProvider.getUserDetails();
    }
}
