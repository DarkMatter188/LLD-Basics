package com.example.producerconsumer.Multi1To100;

import java.util.concurrent.Semaphore;

public class NumberPrinter {
    private int currentNumber = 1;
    private Semaphore oddSemaphore = new Semaphore(1);
    private Semaphore evenSemaphore = new Semaphore(0);
    private int maxNumber = 100;

    public void printEvenNumber() throws InterruptedException {
        while(currentNumber <= maxNumber) {
            oddSemaphore.acquire();
            if(currentNumber <= maxNumber) {
                System.out.println("Odd Thread: " + currentNumber);
                currentNumber++;
            }
            evenSemaphore.release();
        }
    }

    public void printOddNumber() throws InterruptedException {
        while(currentNumber <= maxNumber) {
            evenSemaphore.acquire();
            if(currentNumber <= maxNumber) {
                System.out.println("Even Thread: " + currentNumber);
            }
            oddSemaphore.release();
        }
    }
}
