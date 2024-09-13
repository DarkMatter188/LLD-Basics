package com.example.Collections;

public class Student implements Comparable<Student> {
    String name;
    int age;
    int rollNumber;
    String batch;

    public Student(String name, int age, int rollNumber, String batch) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.batch = batch;
    }

    @Override
    public int compareTo(Student other) {
        return -(this.rollNumber - other.rollNumber);
    }

    @Override
    public String toString() {
        return "[Name= " + this.name + " Age= " + this.age + " RollNumber= " + this.rollNumber + " Batch= " + this.batch + "]";
    }

}
