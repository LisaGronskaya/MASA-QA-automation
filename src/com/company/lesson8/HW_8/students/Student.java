package com.company.lesson8.HW_8.students;

public class Student extends Person {

    private String courseName;
    private boolean isActive;

    public Student(String name, String email, long birthYear, String courseName, boolean isActive) {
        super(name, email, birthYear);
        this.courseName = courseName;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printInfo() {
        System.out.println("Student " + toString());
        showS();
    }

    public void showS() {
        System.out.println("Course name is " + courseName);
        System.out.println("Status " + isActive);
    }



}