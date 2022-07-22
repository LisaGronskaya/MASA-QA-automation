package com.company.lesson8.tasks;

class Triangle extends Figure {

    public Triangle(double height, double weight) {
        super(height, weight);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public double calculateArea() {
        return ((height * weight) / 2);
    }

    @Override
    public void printArea() {

    }
}

