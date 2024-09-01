package com.example.oops;

public class Instructor extends User{
    String company;
    double avgRating;

    public Instructor() {
        System.out.println("Inside Instructor Constructor");
    }

    public void doSomething(){
        System.out.println("Inside Instructor's doSomething");
    }
}
