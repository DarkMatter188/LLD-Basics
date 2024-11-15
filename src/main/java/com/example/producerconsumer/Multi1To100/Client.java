package com.example.producerconsumer.Multi1To100;

public class Client {
    public static void main(String[] args) {


        NumberPrinter numberPrinter = new NumberPrinter();

        // Create and start the threads
        Thread oddThread = new OddThread(numberPrinter);
        Thread evenThread = new EvenThread(numberPrinter);

        oddThread.start(); // Start the odd thread
        evenThread.start(); // Start the even thread

        // Wait for both threads to finish
        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
        }


    }

}
