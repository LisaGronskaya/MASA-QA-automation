package com.company.lesson4.Loops;
import java.util.Scanner;

public class Loops_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your number: ");
        int a = sc.nextInt();

        while (a < 10) {
            System.out.println(a);
            a++;
        }
    }
}
