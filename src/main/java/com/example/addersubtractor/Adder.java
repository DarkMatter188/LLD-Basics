package com.example.addersubtractor;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1 ; i <= 100000; i++){
            count.value += 1;
        }
    }
}
