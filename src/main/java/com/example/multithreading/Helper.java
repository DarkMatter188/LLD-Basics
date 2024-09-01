package com.example.multithreading;

public class Helper {
    public static void doSomething(){
        System.out.println("Hello from Helper printed by-- "+Thread.currentThread().getName());
    }
}
