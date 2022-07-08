package com.company.lesson6.methods;

public class Method_03_ReturnWithParams {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;

        System.out.println("summary(5, 10) " + summary(5, 10));

        int result = summary(1, 10);
        System.out.println("result = " + result);

    }

    public static int summary(int a, int b) {
//        int result = a + b;
        return a + b;
    }
}