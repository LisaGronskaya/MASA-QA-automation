package com.company.lesson5.HW_5;

import java.util.ArrayList;
import java.util.Random;

public class CustomerArrayList {
    public static void main(String[] args) {
        ArrayList<Double> mmm = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            mmm.add(random.nextDouble());
        }
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double average = 0;

        for (Double aDouble : mmm) {
        }
        for (double number : mmm) {
            if (number % 2 != 0.0) {
                System.out.print(number + " ");
            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            sum += number;

        }

        System.out.println();
        System.out.println("sum = " + sum);
        average = sum / mmm.size();
        System.out.println("average = " + average);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}