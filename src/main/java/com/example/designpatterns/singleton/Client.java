package com.example.designpatterns.singleton;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        DBConnection dbConnection = DBConnection.getInstance();
//        DBConnection dbConnection1 = DBConnection.getInstance();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<DBConnection> future1 = executorService.submit(dbConnection);
        Future<DBConnection> future2 = executorService.submit(dbConnection);
        Future<DBConnection> future3 = executorService.submit(dbConnection);

        DBConnection db1 = future1.get();
        DBConnection db2 = future2.get();
        DBConnection db3 = future3.get();


        System.out.println("DEBUG");
    }




}
