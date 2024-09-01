package com.example.multithreading.numbersfrom1to100;

public class NumberPrinter implements Runnable {
    //Will take a number and print

    private int numberToPrint;

    public NumberPrinter (int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        //run does not take input so pass it via constructor
        System.out.println(numberToPrint + ", Printed by " + Thread.currentThread().getName());
    }

}
