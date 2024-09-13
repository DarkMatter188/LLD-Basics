package com.example.streamandlambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class Client {
    public static void main(String[] args) {


        //Cannot create obj of interface type solution
        //1. Create class that implements that interface and pass its obj


        //2.Anonymous class when use is 1 time define body in obj and use
        //No need to create new class
        Runnable runnable = new Runnable() { //
            @Override
            public void run() {
                System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
            }
        };



        //3.Lambdas
        //Similar to Anonymous class no need to create new class give body near to obj
        //() -> {}
        //() : Method input parameter
        //{} : Method body or implementation
        Runnable r = () -> {
            System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(r);
        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("Hello Apoorv!!");
        });

        thread1.start();

//        Callable<String> callable = new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return "Apoorv";
//            }
//        };
//
//        Thread t = new Thread(callable);  //Not allowed as Thread constructor don't accept callable

        List<Student> students = new ArrayList<>();

        students.add(new Student("Apoorv", 25, 12, "LLD1"));
        students.add(new Student("Ramesh", 27, 14, "DSA"));
        students.add(new Student("John", 29, 1, "Core Java"));
        students.add(new Student("Michael", 32, 5, "Python"));

//        Comparator<Student> ageComparator = (st1, st2) -> {
//            return st1.age - st2.age;
//        };

//        Collections.sort(students, ageComparator);

//        Collections.sort(students, (o1, o2) -> {return o1.age - o2.age;});
        //Can be reduced further as
        Collections.sort(students, (o1, o2)-> o1.age - o2.age);

        System.out.println(students);



    }
}
