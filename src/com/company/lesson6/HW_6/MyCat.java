package com.company.lesson6.HW_6;

import java.util.ArrayList;

public class MyCat {
    public static void main(String[] args) {
        ArrayList<Cat> instances = new ArrayList<>();

        instances.add(new Cat("Vasya", "grey", 17));
        instances.add(new Cat("Simon", "white", 3));
        instances.add(new Cat("Garfield", "ginger", -3));
        instances.add(new Cat("Salem", "black", 40));
        instances.add(new Cat("Begemot", "black", 100));

        for (Cat instance : instances) {
            if (instance.age < 0) {
                System.out.println("error");
            } else {
                System.out.println(instance.toString());

            }
        }
    }
}

