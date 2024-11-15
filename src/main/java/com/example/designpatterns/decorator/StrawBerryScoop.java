package com.example.designpatterns.decorator;

public class StrawBerryScoop implements IceCream{
    IceCream iceCream;

    StrawBerryScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    StrawBerryScoop(){}



    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 30;
        }
        return 0;
    }

    @Override
    public String getDescription() {

        return iceCream.getDescription() + " + StrawBerryScoop";
    }
}
