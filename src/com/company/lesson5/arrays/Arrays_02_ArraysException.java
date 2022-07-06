package com.company.lesson5.arrays;

public class Arrays_02_ArraysException {
    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
        arr[3] = 6;
    }
}
