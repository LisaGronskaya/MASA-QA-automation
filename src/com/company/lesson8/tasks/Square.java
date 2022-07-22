package com.company.lesson8.tasks;

public class Square extends Figure{
    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public Square(double height, double weight) {
        super(height, weight);
    }

    @Override
    public double calculateArea() {
        return (height * weight);
    }

    @Override
    public void printArea() {

    }
}
