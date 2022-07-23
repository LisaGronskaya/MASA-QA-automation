package com.company.lesson9.tasks.task_1_basic_calculator;

public class BasicCalculatorMain {

    public static void main(String[] args) {

        BasicCalculator calculator = new BasicCalculator();
        calculator.sum(4, 6);
        calculator.minus(4, 6);
        calculator.multiple(4, 6);
        calculator.division(4, 0); //int - exception, double - result infinity
    }
}
