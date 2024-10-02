package com.example.designpatterns.prototype;

public class Client {
    public static void main(String[] args) {
        //create all prototype objects of diff batches with common attributes
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student apoorv = studentRegistry.get("Aug23EveningBatch").clone();
        apoorv.setName("Apoorv");
        apoorv.setAge(26);
        apoorv.setPsp(89.9);

        Student john = studentRegistry.get("Aug23EveningBatch").clone();
        john.setName("John");
        john.setAge(27);
        john.setPsp(79.9);

        Student Joe = studentRegistry.get("Aug23EveningBatchIntelligent").clone();



        System.out.println("DEBUG");

    }

    private static void fillRegistry(StudentRegistry studentRegistry) {

        Student aug23EveningBatch = new Student();
        //set common attributes
        aug23EveningBatch.setBatch("Aug23EveningBatch");
        aug23EveningBatch.setAverageBatchPsp(80.0);

        //store in registry all objects in a map
        studentRegistry.register("Aug23EveningBatch", aug23EveningBatch);

        Student aug23EveningBatchIntelligent = new IntelligentStudent();
        aug23EveningBatchIntelligent.setBatch("Aug23EveningBatch");
        aug23EveningBatchIntelligent.setAverageBatchPsp(90.0);

        studentRegistry.register("Aug23EveningBatchIntelligent", aug23EveningBatchIntelligent);

    }
}
