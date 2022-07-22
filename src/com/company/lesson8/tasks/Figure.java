package com.company.lesson8.tasks;

abstract class Figure {

    protected double height;
    protected double weight;

    @Override
    public String toString() {
        return "Figure{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Figure(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public abstract double calculateArea();

    public abstract void printArea();

}

