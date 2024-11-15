package com.example.designpatterns.stratergy;

public class CarPathCalculator implements PathCalculatorStratergy{

    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Car Path");
    }
}
