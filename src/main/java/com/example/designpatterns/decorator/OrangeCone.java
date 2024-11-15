package com.example.designpatterns.decorator;

public class OrangeCone implements IceCream{
    //Here Orange cone can act only as base addon not topping addon

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
