package com.example.designpatterns.stratergy;

public class PathCalculatorFactory {
    public static PathCalculatorStratergy getPathCalculatorForMode(String mode){
        if(mode.equals("Car")){
            return new CarPathCalculator();
        }
        else if(mode.equals("Bike")){
            return new BikePathCalculator();
        }
        else if(mode.equals("Walk")){
            return new WalkPathCalculator();
        }
        else{
            return null;
        }
    }
}
