package com.company.lesson5.collections;

import java.util.HashMap;
import java.util.HashSet;

public class Collections_02_HashSet {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        System.out.println("hashSet.isEmpty() = " + hashSet.isEmpty());
        hashSet.add("Alex");
        hashSet.add("name");
        hashSet.add("last name");
        hashSet.add("Alex");


        System.out.println("hashSet.isEmpty() = " + hashSet.isEmpty());
        hashSet.forEach( System.out::println);
    }
}
