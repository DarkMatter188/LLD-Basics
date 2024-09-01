package com.example.multithreading.HelloWorldPrinter;

public class Client {
    //To run by separate threads steps are
    public static void main(String[] args) {

        System.out.println("Hello World printed by-- "+Thread.currentThread().getName());
        //1.Create a task by implementing Runnable as Thread constructor needs Runnable type obj
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();


        //2.Create new Thread and assign task to it
        Thread thread = new Thread(helloWorldPrinter);

        //3.Run the created thread
        thread.start();

        System.out.println("Hello World printed by-- "+Thread.currentThread().getName());
    }

}
