package com.example.addersubtractoratomicinteger;

import com.example.oops.constructorChaining.A;

import java.util.concurrent.atomic.AtomicInteger;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }


    @Override
    public void run() {
        for(AtomicInteger i = new AtomicInteger(1); i.get() <= 100000; i.getAndIncrement()){
            count.value.decrementAndGet();
        }
    }
}
