package com.example.addersubtractorsynchronisedmethod;

public class Count {
    private int value;
    //coming from 3rd party so Client of this class no need to handle synchronisation
    //Will handle in this class by synchronised method

    public Count(int count) {
        this.value = count;
    }

    public int getValue() {
        return value;
    }

    public synchronized void incrementValue(int i){
        value += i;
    }
}
