package com.company.lesson9.HW_9;

import java.util.ArrayList;

public class WorkerMain {
    public static void main(String[] args) {
        Worker programmer = new Programmer("Ivan");
        Worker driver = new Driver("Moysha");
        Worker cook = new Cook("Sarochka");

        ArrayList<Programmer> progerArrayList = new ArrayList<>();
        ArrayList<Cook> cooksArrayList = new ArrayList<>();
        ArrayList<Driver> driversArrayList = new ArrayList<>();

        progerArrayList.add((Programmer) programmer);
        cooksArrayList.add((Cook) cook);
        driversArrayList.add((Driver) driver);

        progerArrayList.forEach(x -> x.voice());
        cooksArrayList.forEach(x -> x.voice());
        driversArrayList.forEach(x -> x.voice());

    }
}