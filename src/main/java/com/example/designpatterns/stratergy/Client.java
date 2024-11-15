package com.example.designpatterns.stratergy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps map = new GoogleMaps();
        map.findPath("Delhi","Agra","Car");
    }

}
