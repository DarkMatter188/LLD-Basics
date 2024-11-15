package com.example.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class InvoiceGenerator implements OnOrderPlacedSubscriber {

    InvoiceGenerator(){
        Flipkart flipkart  = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Generating invoice now");
    }
}
