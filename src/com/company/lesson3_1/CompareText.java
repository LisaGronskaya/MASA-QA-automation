package com.company.lesson3_1;

public class CompareText {
    public static void main(String[] args) {
        String name = "Alex";
        String secondName = "Alex";
        String thirdName = "Alex2";
        String anotherName = "aLeX2";

        boolean areEqual = name.equals(secondName);
        System.out.println("areEqual = " + areEqual);

        areEqual = secondName.equals(thirdName);
        System.out.println("areEqual = " + areEqual);

        areEqual = thirdName.equals(anotherName);
        System.out.println("areEqual = " + areEqual);
    }
}
