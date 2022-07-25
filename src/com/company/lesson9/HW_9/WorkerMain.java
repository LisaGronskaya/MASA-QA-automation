package com.company.lesson9.HW_9;

import java.util.ArrayList;

public class WorkerMain {
    public static void main(String[] args) {
        Worker programmer1 = new Programmer("Ivan");
        Worker programmer2 = new Programmer("Vovan");
        Worker programmer3 = new Programmer("Boris");
        Worker driver1 = new Driver("Moysha");
        Worker driver2 = new Driver("Shloyma");
        Worker driver3 = new Driver("Joseph");
        Worker cook1 = new Cook("Sarochka");
        Worker cook2 = new Cook("Klarochka");
        Worker cook3 = new Cook("Maria");

        ArrayList<Programmer> progerArrayList = new ArrayList<>();
        ArrayList<Cook> cooksArrayList = new ArrayList<>();
        ArrayList<Driver> driversArrayList = new ArrayList<>();

        progerArrayList.add((Programmer) programmer1);
        progerArrayList.add((Programmer) programmer2);
        progerArrayList.add((Programmer) programmer3);
        driversArrayList.add((Driver) driver1);
        driversArrayList.add((Driver) driver2);
        driversArrayList.add((Driver) driver3);
        cooksArrayList.add((Cook) cook1);
        cooksArrayList.add((Cook) cook2);
        cooksArrayList.add((Cook) cook3);

        progerArrayList.forEach(x -> x.voice());
        cooksArrayList.forEach(x -> x.voice());
        driversArrayList.forEach(x -> x.voice());

    }
}