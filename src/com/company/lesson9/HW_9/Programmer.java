package com.company.lesson9.HW_9;

public class Programmer extends Worker implements WriteСode {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void CanWriteCode() {
        System.out.println("I can write code and eat all the cookies in the office");
    }

    @Override
    public void voice() {
        System.out.println("Hi, i'm " + name);
        CanWriteCode();
        System.out.println("-------------");
    }
}