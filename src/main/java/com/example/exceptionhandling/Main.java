package com.example.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        try{
//            readFromFile("abc"); //handle by try catch block or throw it to Client who calls it
//
//        }catch(IOException e){
//
//        }

//        readFromFile("abc"); //Exception goes to Client and will see full stack trace
        String s = null;
        System.out.println(s.length());
    }
    public static void readFromFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        fileReader.read();
    }
}
