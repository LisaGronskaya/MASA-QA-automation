package com.company.lesson8.HW_8.animals;

public class Cat extends Mammal {

    public Cat() {
        System.out.println("I am a cat");
    }

    public void howDoYouLive() {
        System.out.println("Norm");
    }

    @Override
    public void howManyLegs() {
        System.out.println("I have 4 legs");
    }
}
