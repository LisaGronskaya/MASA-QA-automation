package com.company.lesson9.tasks.task_1_basic_calculator;

/**
 * Создайте interface Calculate.  В нём 4 метода: void sum(double a, double b), void minus(double a, double b),
 * void multiple(double a, double b), void division(double a, double b).
 * Создайте класс BasicCalculator. Реализуйте interface Calculate.
 * <p>
 * *Метод деления обработайте с помощью exception (можно написать свой exception).
 * <p>
 * Создайте класс BasicCalculatorMain.
 * <p>
 * Создайте объект класса BasicCalculator. Вызовите возможные методы.
 */
public class BasicCalculator implements Calculate {

    @Override
    public void sum(double a, double b) {
        System.out.println("result is " + (a + b));
    }

    @Override
    public void minus(double a, double b) {
        System.out.println("result is " + (a - b));
    }

    @Override
    public void multiple(double a, double b) {
        System.out.println("result is " + (a * b));
    }

    @Override
    public void division(double a, double b) {
        if (!(b == 0)) {
            System.out.println("result is " + (a / b));
        } else {
            try {
                System.out.println("result is " + ((int) a / (int) b));
            }
            catch (ArithmeticException arithmeticException) {
                System.out.println(arithmeticException.getCause());
                System.out.println(arithmeticException.getMessage());
            }
        }
    }
}
