package com.company.lesson6.classes.cars;

public class MyCars {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.color = "Black";
        bmw.brand = "BMW";
        bmw.year = 1999;
// bmw.year = -123;
        System.out.println(bmw.year);

        Car tesla = new Car("Tesla", "white", 2022);
        System.out.println("tesla" + tesla);
    }

}
