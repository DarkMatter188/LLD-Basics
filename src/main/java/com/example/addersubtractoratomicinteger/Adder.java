package com.example.addersubtractoratomicinteger;

import java.lang.reflect.Array;

import java.util.concurrent.atomic.AtomicInteger;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(AtomicInteger i = new AtomicInteger(1); i.get() <= 100000; i.getAndIncrement()){
            count.value.incrementAndGet();
        }

    }
}
