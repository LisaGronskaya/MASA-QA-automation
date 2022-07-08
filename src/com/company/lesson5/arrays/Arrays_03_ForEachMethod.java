package com.company.lesson5.arrays;

public class Arrays_03_ForEachMethod {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("First for loop run");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        System.out.println("\nSecond for loop run");
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i] += 5) + " ");

        }

        System.out.println("\nFirst for-each loop run");
        for (int number : array) {
            System.out.print(number + " ");
        }

        for (int number : array) {
            number += 5;

        }

        System.out.println("\nSecond for-each loop run");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
