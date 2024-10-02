package com.example.designpatterns.factory;

import com.example.designpatterns.factory.components.button.Button;
import com.example.designpatterns.factory.components.button.MacButton;
import com.example.designpatterns.factory.components.menu.MacMenu;
import com.example.designpatterns.factory.components.menu.Menu;

public class MacUiFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
