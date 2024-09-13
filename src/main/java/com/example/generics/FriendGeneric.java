package com.example.generics;

public class FriendGeneric<T, U> {
    T p1;
    T p2;
    U relation;

    public FriendGeneric(T p1, T p2, U relation) {
        this.p1 = p1;
        this.p2 = p2;
        this.relation = relation;
    }

    //static generic methods
    public static <E> void something(E e){
        System.out.println(e);
    }

    //static method with 2 parameters
    public static <E,V> void somethingElse(E e, V v){
        System.out.println("e1 = "+e + " e2 = "+v);
    }

    //Same method can be written as
    public static <E> void somethingElseElse(E e1, E e2){
        System.out.println("e1 = "+e1 + " e2 = "+e2);
    }

    //static method with generic return type rare use
    public static <E> E somethingWithReturn(String name){
        System.out.println(name);
        return (E)"Apoorv";
    }


}
