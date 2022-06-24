package com.company.lesson3_1;

public class Ternary {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 6;
        String result;

        result = (a == b) ? "a and b are equals" : "a and b are not equals";
        System.out.println("result = " + result);
        result = (a == c) ? "a and c are equals" : "a and c are not equals";
        System.out.println("result = " + result);

    }
}
