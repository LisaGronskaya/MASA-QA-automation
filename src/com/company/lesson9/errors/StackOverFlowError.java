package com.company.lesson9.errors;

public class StackOverFlowError {
    public static void main(String[] args) {

        calculate(5);
    }

    public static int calculate(int number) {
        return number * calculate(number -1);
    }
}