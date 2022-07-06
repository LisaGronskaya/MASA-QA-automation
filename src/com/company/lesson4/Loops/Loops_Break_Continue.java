package com.company.lesson4.Loops;

public class Loops_Break_Continue {
    public static void main(String[] args) {

        int a = 0;

        while (a < 10) {
            a++;

            if (a == 3 || a == 5) {
                continue;
            }

            if (a == 8) {
                break;
            }

            System.out.println(a);
        }
    }
}
