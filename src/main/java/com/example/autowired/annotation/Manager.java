package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    //@Autowired // We can remove the constructor and inject field autowiring dependency, less recommended
    private Employee employee;

    @Autowired//Recommended is constructor Autowiring
    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
