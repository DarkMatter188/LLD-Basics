package com.example.Collections;

import java.net.Inet4Address;
import java.util.*;

public class Client {
    public static void main(String[] args) {


        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new LinkedList<Integer>();
        List<Integer> l3 = new Vector<Integer>();
        List<Integer> l5 = new Stack<Integer>();

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(1);
        q1.add(5);
        q1.add(2);
//        System.out.println(q1);

        //Unique elements with hashtable no order followed
        Set<Integer> set1 = new HashSet<>();

        //Maintains order uses Hashmap + DLL
        Set<Integer> set2 = new LinkedHashSet<>();

        //Balanced BST(Self Balancing AVL tree) l,r has max 1 diff
        //sorted order
        Set<Integer> set3 = new TreeSet<>();

        set1.add(1);
        set1.add(5);
        set1.add(2);

        set2.add(1);
        set2.add(5);
        set2.add(2);

        set3.add(1);
        set3.add(5);
        set3.add(2);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new LinkedHashMap<>();
        Map<String, Integer> map4 = new TreeMap<>();


    }

}
