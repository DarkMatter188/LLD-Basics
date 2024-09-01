package com.example.multithreading.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World printed by-- "+ Thread.currentThread().getName());
    }
}
