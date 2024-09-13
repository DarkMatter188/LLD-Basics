package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class ClientGeneric {
    public static void main(String[] args) {

        List<FriendGeneric<String, Integer>> list = new ArrayList<>();
        FriendGeneric<String, Integer> friendRelation = new FriendGeneric<>("Apoorv", "Ramesh", 10);
        list.add(friendRelation);

        FriendGeneric.something("Apoorv");
        FriendGeneric.somethingElse("Ramesh", 10);
        FriendGeneric.somethingElseElse(100, 100);

        String s = FriendGeneric.somethingWithReturn("Rahul");
        System.out.println(s);
    }
}
