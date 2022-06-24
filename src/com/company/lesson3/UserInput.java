package com.company.lesson3;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int age;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        name = sc.nextLine();

        System.out.println("What is your age?");
        age = sc.nextInt();

        System.out.println("name = " + name);
        System.out.println("age = " + name);


    }
}
