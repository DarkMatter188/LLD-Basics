package com.example.addersubtractormutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;
    private Lock lock;
    public Subtractor(Count count, Lock lock) {
        this.lock = lock;
        this.count = count;
    }


    @Override
    public void run() {
        for(int i = 1; i <= 100000; i++){
            //critical section so need to lock
            lock.lock();
            count.value -= 1;
            lock.unlock();
        }
    }
}
