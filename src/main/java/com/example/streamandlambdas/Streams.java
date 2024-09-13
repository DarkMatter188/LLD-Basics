package com.example.streamandlambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4, 3, 5, 6, 9, 8, 2, 7, 10);
//        List<Integer> oddNumbers = new ArrayList<>();

        //Filter
//        for(Integer number : numbers) {
//            if(number % 2 == 1){
//                oddNumbers.add(number);
//            }
//        }

        //Using Streams
        //convert list to stream of data
        Stream<Integer> stream = numbers.stream();
        //filter takes Predicate interface or super class of it with test functional interface

        List<Integer> oddNumbers = stream.filter((x) -> x % 2 == 1).collect(Collectors.toList());
        //pipeline stream is closed by terminal method so cannot be used again create new
        Stream<Integer> stream1 = numbers.stream();

        List<Integer> output =
                stream1
                        .filter((x) -> x % 2 == 1)
                        .map((x) -> x*x)
                        .sorted()
                        .toList();

//        System.out.println(output);

//        Stream<Integer> stream2 = numbers.stream();
        Optional<Integer> optionalI =
                numbers.stream()
                        .filter((x) -> {
                            System.out.println("Filtering: "+x);
                            return x % 2 == 1;
                        })
                        .map((x) -> {
                            System.out.println("Mapping: "+x);
                            return x*x;
                        })
//                        .sorted()
                        .findFirst();

        if(optionalI.isPresent()){
            System.out.println(optionalI.get());
        }


//        System.out.println(oddNumbers);

//        System.out.println(output1);


        //flatmap function of streams to flatten 2D collections
        List<List<String>> lists = Arrays.asList(
                Arrays.asList("Orange", "Apple"),
                Arrays.asList("Guava", "Mango"),
                Arrays.asList("Peach","Tomato")
        );

        List<String> flattenedList = lists.stream()
                                    .flatMap((list) -> {
                                                return list.stream()
                                                        .map(i -> i);
                                            }
                                    ).toList();


        System.out.println(flattenedList);

    }
}
