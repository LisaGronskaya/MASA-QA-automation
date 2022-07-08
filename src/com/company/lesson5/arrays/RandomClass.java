package com.company.lesson5.arrays;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("randomNumber = " + randomNumber);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j]);

            }

        }
    }
}
