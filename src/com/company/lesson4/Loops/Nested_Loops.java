package com.company.lesson4.Loops;

public class Nested_Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 5; j++) { // принято внутри вложенного цикла называть переменную j
                System.out.printf("%4d", j); //% - это регулярное выражение
            }
            System.out.println();
        }
    }
}