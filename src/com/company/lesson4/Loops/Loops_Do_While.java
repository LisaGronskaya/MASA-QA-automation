package com.company.lesson4.Loops;

import java.util.Scanner;

public class Loops_Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        do {
            System.out.println(a++);
        }
        while (a < 10);
        System.out.println(a);
    }
}

