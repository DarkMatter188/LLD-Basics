package com.example.designpatterns.factory;

public class Flutter {
    //Will have all non factory methods
    void refreshUI(){
        System.out.println("Refreshing UI from Flutter");
    }

    void setTheme(){
        System.out.println("Setting Theme from Flutter");
    }

    //Need a factory method to call specific UIFactory methods in Flutter class
    public UIFactory getUIFactory(Platform platform){
        return UIFactoryFactory.getUIFactory(platform);
    }
}
