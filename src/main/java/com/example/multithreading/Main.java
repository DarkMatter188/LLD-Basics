package com.example.multithreading;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello there this is thread-- " + Thread.currentThread().getName());
        Helper.doSomething();
    }
}
