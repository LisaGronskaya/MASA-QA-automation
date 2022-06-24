package com.company.lesson3_1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное.");
        } else {
            System.out.println("Число " + number + " нечетное");
        }
    }
}
