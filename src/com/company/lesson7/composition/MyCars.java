package com.company.lesson7.composition;

public class MyCars {
    public static void main(String[] args) {

        Engine bmwEngine = new Engine(250, 8);
        Wheel[] bmbWheels = new Wheel[4];
        bmbWheels[0] = new Wheel(18, 2.5);
        bmbWheels[1] = new Wheel(18, 2.5);
        bmbWheels[2] = new Wheel(18, 2.5);
        bmbWheels[3] = new Wheel(18, 2.5);

        Car bmw = new Car("BMW", "X5", 2022, bmwEngine, bmbWheels);
        System.out.println(bmw);

        Car tesla = new Car("Tesla", "Tesla3", 2021, new Engine(300, 0), bmbWheels);
        System.out.println(tesla);
        System.out.println("tesla.getEngine().getHorsePower() = " + tesla.getEngine().getHorsePower());
    }
}
