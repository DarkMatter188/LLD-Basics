package com.example.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(11, 23, 2, 6, 100, 87);
//        Collections.sort(numbers);

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Apoorv", 25, 12, "LLD1"));
        students.add(new Student("Ramesh", 27, 14, "DSA"));
        students.add(new Student("John", 29, 1, "Core Java"));
        students.add(new Student("Michael", 32, 5, "Python"));

//        Collections.sort(students);
        //Will override default comparable with this new Comparator interface
        Collections.sort(students , new StudentNameComparator());

        for(Student student : students) {
            System.out.println(student.toString());
        }
//        System.out.println(students);
    }
}
