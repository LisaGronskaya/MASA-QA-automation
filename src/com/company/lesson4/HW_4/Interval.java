package com.company.lesson4.HW_4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter number");
        for (int i = 0; i <= 100; i++) {
            int x = sc.nextInt();
            if (x < 0 || x > 100) {
                System.out.println("Error, try again ");
            }
            if (x >= 0 && x <= 14) {
                System.out.println("range 0-14");
                break;
            }
            if (x >= 15 && x <= 35) {
                System.out.println("range 15-35");
                break;
            }
            if (x >= 36 && x <= 50) {
                System.out.println("range 36-50");
                break;
            }
            if (x >= 51 && x <= 100) {
                System.out.println("range 51-100");
                break;
            }
        }
    }
}