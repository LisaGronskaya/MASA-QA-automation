package com.company.lesson9.HW_9;

public class Driver extends Worker implements Drive {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void сanDrive() {
        System.out.println("I can drive cars");
    }

    @Override
    public void voice() {
        System.out.println("Hi, i'm " + name);
        сanDrive();
        System.out.println("-------------");
    }
}