package com.example.designpatterns.factory;

import com.example.designpatterns.factory.components.button.Button;
import com.example.designpatterns.factory.components.menu.Menu;

public class Client{
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        UIFactory uiFactory = flutter.getUIFactory(Platform.IOS);
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();

        button.displayButton();
        menu.displayMenu();

    }
}
