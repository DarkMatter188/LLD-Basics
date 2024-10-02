package com.example.designpatterns.factory;

import com.example.designpatterns.factory.components.button.AndroidButton;
import com.example.designpatterns.factory.components.button.Button;
import com.example.designpatterns.factory.components.menu.AndroidMenu;
import com.example.designpatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
