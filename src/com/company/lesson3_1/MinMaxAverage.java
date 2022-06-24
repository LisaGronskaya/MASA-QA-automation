package com.company.lesson3_1;
import java.util.Scanner;
public class MinMaxAverage {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        double min;
        double max;
        double average;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = sc.nextDouble();
        System.out.println("Введите второе число: ");
        b = sc.nextDouble();
        System.out.println("Введите третье число: ");
        c = sc.nextDouble();

        average = (a + b + c) / 3;
        System.out.println("average = " + average);

        max = (a >= b) ? a : b;
        max = (max  >= c) ? max : c;

        min = (a <= b) ? a : b;
        max = (min <= c) ? max : c;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

}
