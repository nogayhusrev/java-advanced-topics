package com.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(23, 34, 2, 2, 5, 1, 51, 5122, 4, 121, 31, 141, 14);


        //toCollection(Supplier) : is used to create a Collection using Collector
        System.out.println("------------toCollection(List)--------------");
        List<Integer>
                numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("numberList = " + numberList);

        System.out.println("------------toCollection(Set)--------------");
        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("numberSet = " + numberSet);

        //toList() : to return a collector interface that gathers the input data into a new list
        System.out.println("------------toList()--------------");
        numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("numberList = " + numberList);

        //toSet() : to return a collector interface that gathers the input data into a new set
        System.out.println("------------toSet()--------------");
        numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("numberSet = " + numberSet);

        //toMap(Function, Function) : to return a collector interface that gathers the input data into a new map
        System.out.println("------------toMap(Function, Function)--------------");
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );
        Map<String, Integer> dishMap = menu.stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println("dishMap = " + dishMap);


        //summingInt(ToIntFunction) : to return a Collector that produces the sum of a Integer-valued func
        System.out.println("------------summingInt(ToIntFunction)--------------");
        Integer sum = menu.stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = " + sum);

        //counting() : returns a Collector that counts the number of the elements
        System.out.println("------------summingInt(ToIntFunction)--------------");
        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());
        System.out.println("evenCount = " + evenCount);


        // averagingInt(ToIntFunction) : returns the average of the integers passed values
        System.out.println("------------averagingInt(ToIntFunction)--------------");
        Double calorieAverage = menu.stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("calorieAverage = " + calorieAverage);


        //joining() : is used to join various elements of a character or string array into a single object
        System.out.println("------------joining()--------------");
        List<String> courses = Arrays.asList("Java", "TS", "Js");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println("str = " + str);

        //partitioningBy() : is used to partition a stream of objects based on a given predicate
        System.out.println("------------partitioningBy()--------------");
        Map<Boolean, List<Dish>> veggieDish = menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println("veggieDish = " + veggieDish);
        //System.out.println("veggieDish.get(true) = " + veggieDish.get(true));

        //groupingBy() : is used to group objects by some property and storing result
        System.out.println("------------groupingBy()--------------");
        Map<Type, List<Dish>> dishType = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println("dishType = " + dishType);


    }
}
