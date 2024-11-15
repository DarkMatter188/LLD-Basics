package com.example.designpatterns.stratergy;

public class BikePathCalculator implements PathCalculatorStratergy{
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Bike Path");
    }
}
