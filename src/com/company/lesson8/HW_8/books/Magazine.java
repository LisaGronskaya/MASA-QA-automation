package com.company.lesson8.HW_8.books;

public class Magazine implements Printable {
    private String name;

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Print magazine with name " + this.name);
    }
}
