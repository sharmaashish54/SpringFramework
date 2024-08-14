package com.loose.coupling;

public class LooseCouplingExample {

public static void main(String []args){
    IUserDataProvider databaseProvider = new UserDataProvider();
    UserManager userManager = new UserManager(databaseProvider);
    System.out.println(userManager.getUserInfo());

//Now if we change the DB from UserData provider to WebserviceProvider,
// there is loose coupling

    IUserDataProvider webserviceProvider = new WebServiceProvider();
    UserManager webserviceObj = new UserManager(webserviceProvider);
    System.out.println(webserviceObj.getUserInfo());
}
}
