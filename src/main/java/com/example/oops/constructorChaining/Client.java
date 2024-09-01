package com.example.oops.constructorChaining;

public class Client {
    public static void main(String[] args) {
        D d = new D();

//        A a = new D();
//        a.fun();

        A a = new B();
        a.fun();
    }
}
