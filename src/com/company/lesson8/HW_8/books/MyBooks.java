package com.company.lesson8.HW_8.books;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MyBooks {
    public static void main(String[] args) {

        Printable book = new Book("Dark Tower");
        Printable magazine = new Magazine("Forbes");

        ArrayList<Book> arrayList = new ArrayList<>();


        Set<Printable> printableHashSet = new HashSet<>();
        printableHashSet.add(book);
        printableHashSet.add(magazine);

        printableHashSet.forEach(Printable::print);
    }
}
