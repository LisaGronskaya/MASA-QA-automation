package com.company.lesson5.collections;

import java.util.ArrayList;

public class Collections_01_01_ForEach {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("name 1");
        names.add("name 2");
        names.add("name 3");
        names.add("name 4");
        names.add("name 5");

//        for (String name : names) {
//            System.out.println(name);
//
//        }
        names.forEach((name) -> System.out.println(name)); //lambda
    }
}
