package com.example.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();

//        Builder builder = Student.getBuilder();
//        builder.setName("Apoorv");
//        builder.setAge(26);
//        builder.setPsp(94.0);
//        builder.setGradYear(2021);
//
//        Student student = new Student(builder);
//
//        Student student = builder.build();

        Student student1 = Student.getBuilder()
                            .setName("Apoorv")
                            .setAge(28)
                            .setBatch("Aug23 Beg")
                            .setGradYear(2021)
                            .setUnivName("Scaler")
                            .build();


        System.out.println("DEBUG");
    }
}
