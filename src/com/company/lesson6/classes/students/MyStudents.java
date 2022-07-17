package com.company.lesson6.classes.students;

import java.util.ArrayList;

public class MyStudents {
    public static void main(String[] args) {

        Students alex = new Students("Alex", 34);
        System.out.println(alex.getName());

        Students newStudent = new Students("New Student", -2);

        System.out.println(alex);
        System.out.println(newStudent);

        ArrayList<Students> students = new ArrayList<>();
        students.add(alex);
        students.add(alex);

        students.forEach((x) -> System.out.println(x));

    }
}