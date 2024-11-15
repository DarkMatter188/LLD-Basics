package com.example.producerconsumer.Multi1To100;

public class EvenThread extends Thread {

    private final NumberPrinter numberPrinter;

    public EvenThread(NumberPrinter numberPrinter) {
        this.numberPrinter = numberPrinter;
    }

    @Override
    public void run() {
        try {
            numberPrinter.printEvenNumber(); // Call the method to print even numbers
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
