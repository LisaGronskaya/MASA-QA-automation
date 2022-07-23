package com.company.lesson8.HW_8.animals;

public class Gorilla extends Monkey {

    public Gorilla() {
        System.out.println("I am a Gorilla");
    }

    @Override
    public void howDoYouLive() {
        System.out.println("Better yours");
    }

    @Override
    public void howManyLegs() {
        System.out.println("I have 2 arms and 2 legs");

    }
}