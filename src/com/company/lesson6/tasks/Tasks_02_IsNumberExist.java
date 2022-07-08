package com.company.lesson6.tasks;

public class Tasks_02_IsNumberExist {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int myValue = 10;

        System.out.println(isNumberExist(myValue, array));
    }
    public static boolean isNumberExist(int a, int[] array) {
        boolean flag = false;
        for (int number : array) {
            if (a == number) {
                flag = true;
            }
        }
        return flag;
    }
}
