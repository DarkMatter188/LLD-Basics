package com.example.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class InventoryService implements OnOrderPlacedSubscriber {

    InventoryService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Notyfying inventory");
    }
}
