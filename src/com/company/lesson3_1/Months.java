package com.company.lesson3_1;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of month (1-12): ");

        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Number 1 is January");
                break;
            case 2:
                System.out.println("Number 2 is February");
                break;
            case 3:
                System.out.println("Number 3 is March");
                break;
            case 4:
                System.out.println("Number 4 is April");
                break;
            case 5:
                System.out.println("Number 5 is May");
                break;
            case 6:
                System.out.println("Number 6 is June");
                break;
            case 7:
                System.out.println("Number 7 is July");
                break;
            case 8:
                System.out.println("Number 8 is August");
                break;
            case 9:
                System.out.println("Number 9 is September");
                break;
            case 10:
                System.out.println("Number 10 is October");
                break;
            case 11:
                System.out.println("Number 11 is November");
                break;
            case 12:
                System.out.println("Number 12 is December");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
        sc.close();
    }
}