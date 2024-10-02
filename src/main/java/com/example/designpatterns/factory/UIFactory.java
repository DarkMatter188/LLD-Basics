package com.example.designpatterns.factory;

import com.example.designpatterns.factory.components.button.Button;
import com.example.designpatterns.factory.components.menu.Menu;

public interface UIFactory {
    //Has only factory methods
    Button createButton();

    Menu createMenu(); //Return object of corresponding Menu


}
