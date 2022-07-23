package com.company.lesson9.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ControlsExceptionThrows {
    public static void main(String[] args) throws IOException {

        File file = new File("D://file.txt");
        FileReader fileReader = new FileReader(file);
        fileReader.close();

    }
}
