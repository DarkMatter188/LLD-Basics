package com.example.designpatterns.prototype;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String batch;
    private double psp;

    public Student(){

    }

    public Student(Student student){

        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.psp = student.psp;
        this.averageBatchPsp = student.averageBatchPsp;
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String getBatch() {
//        return batch;
//    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

//    public double getPsp() {
//        return psp;
//    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

//    public double getAverageBatchPsp() {
//        return averageBatchPsp;
//    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    private double averageBatchPsp;

    @Override
    public Student clone() {
//        Student student = new Student();
//        student.name = this.name;
//        student.age = this.age;
//        student.batch = this.batch;
//        student.psp = this.psp;
//        student.averageBatchPsp = this.averageBatchPsp;

//        return student;

        return new Student(this);
    }
}
