package com.company.lesson5.class_Tasks;

public class CustomerArray {
    public static void main(String[] args) {
        double[] array = {2, 3, 4, 5, 66, 77, 88, 99, 100, 200};
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double average = 0;

        System.out.println("Odd Numbers: ");
        for (double number : array) {
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
        average = sum / array.length;
        System.out.println("average = " + average);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}