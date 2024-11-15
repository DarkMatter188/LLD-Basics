package com.example.producerconsumer.Multi1To100;

public class OddThread extends Thread {
    private final NumberPrinter numberPrinter;

    public OddThread(NumberPrinter numberPrinter) {
        this.numberPrinter = numberPrinter;
    }

    @Override
    public void run() {
        try {
            numberPrinter.printOddNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
