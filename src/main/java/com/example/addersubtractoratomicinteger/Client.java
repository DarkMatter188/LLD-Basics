package com.example.addersubtractoratomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //create 2 tasks and assign to 2 threads and run
        Count count = new Count(new AtomicInteger(0));

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);

    }
}
