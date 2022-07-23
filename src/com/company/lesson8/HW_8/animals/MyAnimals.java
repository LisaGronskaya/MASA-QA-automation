package com.company.lesson8.HW_8.animals;

public class MyAnimals {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.howDoYouLive();
        cat.howManyLegs();
        System.out.println();

        Gorilla gorilla = new Gorilla();
        gorilla.howDoYouLive();
        gorilla.howManyLegs();
        System.out.println();

        Anaconda anaconda = new Anaconda();
        anaconda.howDoYouLive();
        anaconda.howManyLegs();
        System.out.println();

        Lizard lizard = new Lizard();
        lizard.howDoYouLive();
        lizard.howManyLegs();
    }
}