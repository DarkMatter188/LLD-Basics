package com.example.designpatterns.decorator;

public class ChocoChips implements IceCream{
    IceCream iceCream;

    ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    ChocoChips() {}



    @Override
    public int getCost() {
        if(iceCream != null) {
            return iceCream.getCost() + 5;
        }
        return 5;
    }

    @Override
    public String getDescription() {
        if(iceCream != null) {
            return iceCream.getDescription() + " + Choco Chips";
        }
        return "";
    }
}
