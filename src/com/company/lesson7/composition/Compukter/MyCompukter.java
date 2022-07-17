package com.company.lesson7.composition.Compukter;

import com.company.lesson7.composition.Car;

public class MyCompukter {
    public static void main(String[] args) {
        Chip chip = new Chip("Intel", 30303L, 4);
        SolidDrive solidDrive = new SolidDrive("Seagate", 2000);
//        Memory[] memory = new Memory {
            new Memory(1, "Kingston");
            new Memory(1, "Kingston");
            new Memory(1, "Kingston");
            new Memory(1, "Kingston");
        };

//        Compukter apple = new Compukter(100500, )
//    }
}
