package com.example.designpatterns.decorator;

public class ChocolateCone implements IceCream{
    //Can act both as base and topping
    IceCream iceCream;

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public ChocolateCone() {

    }


    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + " + Chocolate Cone";
        }

        return "Chocolate Cone";
    }
}
