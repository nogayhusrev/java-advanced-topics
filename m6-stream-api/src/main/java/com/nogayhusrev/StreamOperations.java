package com.nogayhusrev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2134, 43, 5, 42, 31234, 14, 1, 2315, 21, 41, 5, 1, 241);
        System.out.println("----------------FOREACH--------------");
        list.forEach(System.out::println);

        //FILTER
        System.out.println("----------------FILTER--------------");
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        //DISTINCT
        System.out.println("----------------DISTINCT--------------");
        Stream<Integer> str = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct();
        str.forEach(System.out::println);


        //LIMIT
        System.out.println("----------------LIMIT--------------");
        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        //SKIP
        System.out.println("----------------SKIP--------------");
        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(2)
                .forEach(System.out::println);

        //MAP
        System.out.println("----------------MAP--------------");
        list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .forEach(System.out::println);


    }
}
