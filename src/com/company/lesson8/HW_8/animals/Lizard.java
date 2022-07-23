package com.company.lesson8.HW_8.animals;

public class Lizard extends Reptile {

    public Lizard() {
        System.out.println("I am a Lizard");
    }

    @Override
    public void howDoYouLive() {
        System.out.println("Beseder");
    }

    @Override
    public void howManyLegs() {
        System.out.println("I have 4 legs");

    }
}