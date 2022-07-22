package com.company.lesson8.HW_8;

public class Student extends Person {
    public Student(String name, String email, long birthYear) {
        super(name, email, birthYear);
    }

    private String courseName;
    private boolean isActive;

    @Override
    public void printInfo() {
        System.out.println("Student " + toString());
    }

}