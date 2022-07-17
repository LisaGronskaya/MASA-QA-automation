package com.company.lesson7.composition;

public class Engine {

    private int horsePower;
    private int amountOfCylinders;

    public Engine(int horsePower, int amountOfCylinders) {
        this.horsePower = horsePower;
        this.amountOfCylinders = amountOfCylinders;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getAmountOfCylinders() {
        return amountOfCylinders;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
