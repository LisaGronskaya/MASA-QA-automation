package com.company.lesson4.Loops;

import java.util.Scanner;

public class Loops_while_example {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Insert your number: ");
//        int a = sc.nextInt();
        int a = 0;
        while (a <= 1000) {
            if (a % 5 == 0)
                System.out.println(a);
            a++;
        }
    }
}
