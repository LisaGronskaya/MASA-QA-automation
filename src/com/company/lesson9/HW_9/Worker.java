package com.company.lesson9.HW_9;

public class Worker {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(name);
    }
}