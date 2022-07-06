package com.company.lesson5.arrays;

import java.util.Random;

public class MaxGrade {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

        }
    }
}
