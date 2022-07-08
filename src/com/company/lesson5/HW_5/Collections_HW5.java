package com.company.lesson5.HW_5;

import java.util.ArrayList;
import java.util.Random;

public class Collections_HW5 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        ArrayList<String> third = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            first.add(random.nextInt(50));
        }
        second.add("name 1");
        second.add("name 2");
        second.add("name 3");
        second.add("name 4");
        second.add("name 5");
        second.add("name 6");
        second.add("name 7");
        second.add("name 8");
        second.add("name 9");
        second.add("name 10");

        for (int i = 0; i < 10; i++) {
            third.add(first.get(i) + " - " + second.get(i));
        }
        for (String i : third) {
            System.out.println(i + " ");
        }

    }

}
