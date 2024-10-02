package com.example.designpatterns.factory;

import com.example.designpatterns.factory.components.button.Button;
import com.example.designpatterns.factory.components.button.IOSButton;
import com.example.designpatterns.factory.components.menu.IOSMenu;
import com.example.designpatterns.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
