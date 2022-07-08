package com.company.lesson5.collections;

import java.util.HashMap;

public class Collection_03_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1119, "Alex");
        students.put(2229, "Roma");
        students.put(3339, "Polina");
        students.put(4449, "Bill Gates");

        System.out.println(students.get(1119));
        System.out.println(students.get(11));
        System.out.println(students.containsKey(1119));
        System.out.println(students.containsValue("Roma"));
        System.out.println(students.containsValue("Ro"));


    }
}
