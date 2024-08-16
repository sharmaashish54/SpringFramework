package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCBeanExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationLooseCouplingBeanContext.xml");
        UserManager userManager = (UserManager) context.getBean("userManager");
        System.out.println(userManager.getUserInfo());

//Now if we change the DB from UserData provider to WebserviceProvider,
// there is loose coupling


        UserManager webserviceObj = (UserManager) context.getBean("userManagerWebService");
        System.out.println(webserviceObj.getUserInfo());
    }
}
