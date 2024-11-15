package com.example.designpatterns.stratergy;

public class GoogleMaps {

    public void findPath(String from, String to, String mode){
        PathCalculatorStratergy pathCalculatorStratergy = PathCalculatorFactory.getPathCalculatorForMode(mode);
        pathCalculatorStratergy.findPath(from, to);
    }
}
