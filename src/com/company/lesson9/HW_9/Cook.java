package com.company.lesson9.HW_9;

public class Cook extends Worker implements ToCook {
    public Cook(String name) {
        super(name);
    }

    @Override
    public void сanCook() {
        System.out.println("I can make pasta");
    }

    @Override
    public void voice() {
        System.out.println("Hi, i'm " + name);
        сanCook();
        System.out.println("-------------");
    }
}