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
        return super.toString() +
                "courseName = '" + courseName + '\'' +
                ", isActive = " + isActive;
    }
}