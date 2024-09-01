package com.example.multithreading.numbersfrom1to100;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //create 100 threads and run task in that
//        for(int i=1;i<=100;i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
//        }

        //Using executor service to use resources efficiently use 10 threads only instead of 100
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //create tasks then executorService will handle
        for(int i=1;i<=100;i++){

            if(i == 10 || i == 50 || i == 100){
                System.out.println("DEBUG");
            }


            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

        NumberPrinter numberPrinter = new NumberPrinter(1000);
        executorService.execute(numberPrinter);


        executorService.shutdown();
    }
}
