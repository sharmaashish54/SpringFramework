package com.example.autowire.constructor;

public class Specification {

    private String make;
    private String Model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
