package com.example.designpatterns.factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(Platform platform) {
        if(platform.equals(Platform.Android)){
            return new AndroidUIFactory();
        }
        else if(platform.equals(Platform.IOS)){
            return new IOSUIFactory();
        }

        else if(platform.equals(Platform.Mac)){
            return new MacUiFactory();
        }

        else{
            return null;
        }
    }
}
