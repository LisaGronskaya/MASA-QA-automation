package com.company.lesson5.HW_5;

import java.util.HashMap;

public class Countries {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap();
        hm.put("Осло", "Норвегия");
        hm.put("Берн", "Швейцария");
        hm.put("Хельсинки", "Финляндия");
        hm.put("Берлин", "Германия");
        hm.put("Стокгольм", "Швеция");

        for (String value : hm.values()) {
            System.out.println(value);
        }
        hm.forEach((k, v) -> System.out.println(k + " - " + v));

        System.out.println(hm.containsKey("Осло"));
        System.out.println(hm.containsKey("Норвегия"));
        System.out.println(hm.containsValue("Осло"));
        System.out.println(hm.containsValue("Норвегия"));

    }
}