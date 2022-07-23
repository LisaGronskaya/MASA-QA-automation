package com.company.lesson9.exception;

public class OutOfBounds {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println("Starting");

        numbers[57] = 56;

        System.out.println("Finishing");
    }
}
