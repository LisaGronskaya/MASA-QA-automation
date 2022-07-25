package com.company.lesson9.HW_9;

public class Cook extends Worker implements ToCook {
    public Cook(String name) {
        super(name);
    }

    @Override
    public void CanCook() {
        System.out.println("I can make pasta");
    }

    @Override
    public void voice() {
        System.out.println("Hi, i'm " + name);
        CanCook();
        System.out.println("-------------");
    }
}