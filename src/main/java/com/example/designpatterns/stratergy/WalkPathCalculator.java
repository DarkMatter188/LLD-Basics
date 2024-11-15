package com.example.designpatterns.stratergy;

public class WalkPathCalculator implements PathCalculatorStratergy{
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Walking Path");
    }
}
