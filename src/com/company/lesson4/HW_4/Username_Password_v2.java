package com.company.lesson4.HW_4;

import java.util.Scanner;

public class Username_Password_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "Roman";
        String password = "Pirozhok";
        int attempt_counter = 0;

        System.out.println("Enter login");
        String log = sc.nextLine();

        if (log.equals(login)) {
            while (login.equals(log) && attempt_counter < 5) {
                System.out.println("Enter password ");
                attempt_counter++;
                System.out.println("Try " + attempt_counter);
                String pass = sc.nextLine();

                if (pass.equals(password)) {
                    System.out.println("Hello " + log + " you are logged in.");
                    break;

                } else {
                    System.out.println("Invalid password");
                }
            }
        } else {
            System.out.println("Invalid login");
        }
    }
}