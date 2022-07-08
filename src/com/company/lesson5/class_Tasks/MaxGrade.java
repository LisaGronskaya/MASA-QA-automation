package com.company.lesson5.class_Tasks;

import java.util.Random;

public class MaxGrade {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = {1, 2, 3, 4, 5};
        String[] peeps = {"Genadiy", "Petya", "Masha", "Dasha", "Zina"};
        int maxGrade = array[0];
        int Index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxGrade) {
                maxGrade = array[i];
            }
        }
    }
}
