package com.company.lesson4.HW_4;

public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            x++;
        }
        System.out.println(sum);
        System.out.println(x);
        System.out.println("Среднее арифметическое: " + sum / x);
    }
}
