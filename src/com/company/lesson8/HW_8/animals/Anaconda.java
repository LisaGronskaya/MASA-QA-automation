package com.company.lesson8.HW_8.animals;

public class Anaconda extends Snake {

    public Anaconda() {
        System.out.println("I am an Anaconda");
    }

    public void howDoYouLive() {
        System.out.println("Have not given birth yet");
    }

    @Override
    public void howManyLegs() {
        System.out.println("No legs, no arms");
    }
}