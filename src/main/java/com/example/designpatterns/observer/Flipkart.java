package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    //publisher will notify if any event occurred
    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers = new ArrayList<OnOrderPlacedSubscriber>();
    private static Flipkart instance = null;

    //Singleton constructor to allow only 1obj of Flipkart in diff services
    private Flipkart() {}

    public static Flipkart getInstance(){
        if(instance == null){
            instance = new Flipkart();
        }
        return instance;
    }

    void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.add(onOrderPlacedSubscriber);

    }

    void unRegisterSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscribers.remove(onOrderPlacedSubscriber);
    }

    //Loop to call automatically all services that are registered
    public void onOrderPlaced(){
        //execute all services
        for(OnOrderPlacedSubscriber onOrderPlacedSubscriber : onOrderPlacedSubscribers){
            onOrderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
