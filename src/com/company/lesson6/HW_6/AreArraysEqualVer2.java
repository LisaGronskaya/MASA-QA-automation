package com.company.lesson6.HW_6;

import java.util.Random;

public class AreArraysEqualVer2 {
    public static void main(String[] args) {
        int[] array1 = new int[100000000];
        int[] array2 = new int[100000000];
        Random random = new Random();


        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt();
        }

        notSurprise(array1, array2);
    }

    public static void notSurprise(int[] arr1, int[] arr2) {
        if (arr1.equals(arr2)) {
            System.out.println("true, когда рак на горе свистнет");
        } else {
            System.out.println("not true))))");
        }

    }
}