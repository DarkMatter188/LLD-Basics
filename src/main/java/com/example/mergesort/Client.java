package com.example.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> listToSort = List.of(5,9,8,3,2,1,7,11,15,2);
        //will sort list in separate thread executor framework not in main thread

        //create task
        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(listToSort, executorService);
        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);

        List<Integer> sortedList = sortedListFuture.get();

        System.out.println(sortedList);
    }
}
