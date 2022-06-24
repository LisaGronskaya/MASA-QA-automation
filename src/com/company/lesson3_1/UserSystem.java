package com.company.lesson3_1;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "Roman";
        String password = "Pukan";

        System.out.println("Введите логин");
        String log = sc.nextLine();

        if (log.equals(login)) {
            System.out.println("Введите пароль");
            String pass = sc.nextLine();

            if (pass.equals(password)) {
                System.out.println("Здравствуйте " + log + " Вы вошли в систему.");

            } else {
                System.out.println("Вы ввели неверный пароль!");
            }
        } else {
            System.out.println("Вы кто?");
        }
    }
}
