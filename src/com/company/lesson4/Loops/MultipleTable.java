package com.company.lesson4.Loops;

public class MultipleTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.printf("%4d", j * i);
            }
            System.out.println();
        }
    }
}