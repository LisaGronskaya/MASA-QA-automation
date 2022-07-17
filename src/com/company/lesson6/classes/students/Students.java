package com.company.lesson6.classes.students;

import java.util.Scanner;

public class Students {

    private Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;


    public Students(String name, int age) {
        this.name = name;
        while (age < 18) {
            System.out.println("This age is incorrect, please try again");
            age = scanner.nextInt();
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}