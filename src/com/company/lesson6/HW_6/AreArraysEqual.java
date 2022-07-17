package com.company.lesson6.HW_6;

import com.company.lesson6.classes.students.Students;

import java.util.Arrays;

public class AreArraysEqual {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(whatsArray(array1, array2));
    }
    public static boolean whatsArray(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }
}