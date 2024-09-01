package com.example.oops.constructorChaining;

public class C extends B{
    public C() {
        System.out.println("C's constructor");
    }

    public C(String str) {
        System.out.println("C's constructor with param");
    }

    public C(String str, int x) {
        System.out.println("C's constructor with 2 params");
    }

    public C(int y, String s) {
        System.out.println("C's constructor with 2 params with reverse params");
    }

    public void fun(){
        System.out.println("Hi");
    }
}
