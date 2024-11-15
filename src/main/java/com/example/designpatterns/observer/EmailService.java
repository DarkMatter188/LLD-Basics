package com.example.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class EmailService implements OnOrderPlacedSubscriber {

    EmailService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending Email now");
    }
}
