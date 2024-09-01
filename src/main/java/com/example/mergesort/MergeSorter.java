package com.example.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    //Task created to sort left, right side of list separately in 2 threads
    private List<Integer> listToSort;
    private ExecutorService executorService;

    MergeSorter(List<Integer> listToSort, ExecutorService executorService) {
        this.listToSort = listToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        //Logic or merge sort algorithm here
        //base case
        if(listToSort.size() <= 1){
            return listToSort;
        }

        int mid = listToSort.size()/2;
        List<Integer> leftList = new ArrayList<> ();
        List<Integer> rightList = new ArrayList<> ();

        for(int i=0;i<mid;i++){
            leftList.add(listToSort.get(i));
        }

        for(int i=mid;i<listToSort.size();i++){
            rightList.add(listToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftList, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightList, executorService);

        //now give this two lists to 2 separate threads to sort them
        //Will reuse executor service as it is created again and again in recursive call
//        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSortedListFuture = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedListFuture = executorService.submit(rightMergeSorter);

        //Algorithm to merge 2 sorted Lists
        List<Integer> sortedList = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        List<Integer> leftSortedList = leftSortedListFuture.get();
        List<Integer> rightSortedList = rightSortedListFuture.get();

        while(i<leftSortedList.size() && j<rightSortedList.size()){
            if(leftSortedList.get(i) < rightSortedList.get(j)){
                sortedList.add(leftSortedList.get(i));
                i++;
            }
            else{
                sortedList.add(rightSortedList.get(j));
                j++;
            }
        }

        while(i<leftSortedList.size()){
            sortedList.add(leftSortedList.get(i));
            i++;
        }

        while(j<rightSortedList.size()){
            sortedList.add(rightSortedList.get(j));
            j++;
        }
        return sortedList;
    }
}
