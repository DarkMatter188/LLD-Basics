package com.example.addersubtractormutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.lock = lock;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1 ; i <= 100000; i++){
            //only this line is critical section so lock here
            lock.lock();
            count.value += 1;
            lock.unlock();
        }
    }
}
