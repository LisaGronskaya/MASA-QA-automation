package com.company.lesson8.tasks;

public class Rectangle extends Figure{
    public Rectangle(double height, double weight) {
        super(height, weight);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public double calculateArea() {
        return weight * height;
    }

    @Override
    public void printArea() {

    }
}
