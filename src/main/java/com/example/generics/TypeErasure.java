package com.example.generics;

import java.util.List;

public class TypeErasure {
    public static void main(String[] args) {

        List<String> l1 = List.of("Apoorv", "Ramesh");
        List l2 = List.of("Apoorv", 12, "Ramesh");
        List<Integer> l3 = List.of(1, 2, 3);
        System.out.println(l1.getClass());
        System.out.println(l2.getClass());
        System.out.println(l3.getClass());
    }
}
