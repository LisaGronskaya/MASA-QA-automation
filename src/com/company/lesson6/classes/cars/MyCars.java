package com.company.lesson6.classes.cars;

public class MyCars {
    public static void main(String[] args) {
        Car.carsCreated();

        Car bmw = new Car();
        bmw.color = "Black";
        bmw.manufacture = "BMW";
        bmw.year = 1999;
//        bmw.year = -123;

        System.out.println(bmw.year);
        System.out.println(bmw);

        Car tesla = new Car("Tesla", "white", 2022);
        System.out.println(tesla);

//        System.out.println("Car.created = " + Car.created);
        Car.carsCreated();
    }
}