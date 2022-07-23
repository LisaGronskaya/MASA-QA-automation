package com.company.lesson9.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ControlsExceptionTryCatch {
    public static void main(String[] args){

        File file = new File("D://file.txt");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Чувак, а где же твой файл?");
        }
    }
}
