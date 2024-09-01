package com.example.oops.constructorChaining;

public class D extends C{
    public D() {
        //super is always first line inside child constructor
        super(26, "Apoorv");
        System.out.println("D's constructor");
    }

    public void fun(){
        System.out.println("Bye");
    }
}
