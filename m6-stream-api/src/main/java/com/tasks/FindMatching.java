package com.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindMatching {

    public static void main(String[] args) {


        List<Dish> dishes = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );

        //All matching
        System.out.println("------------All Match-------------");
        boolean isHealthy = dishes.stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("isHealthy = " + isHealthy);


        //Any Match
        System.out.println("------------Any Match-------------");
        if (dishes.stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegetarian friendly");


        //None Match
        System.out.println("------------None Match-------------");
        isHealthy = dishes.stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println("isHealthy = " + isHealthy);

        //Find Any
        System.out.println("------------Find Any-------------");
        Optional<Dish> dish = dishes.stream().filter(Dish::isVegetarian).findAny();
        System.out.println("dish = " + dish);

        //Find First
        System.out.println("------------Find First-------------");
        dish = dishes.stream().filter(Dish::isVegetarian).findFirst();
        System.out.println("dish = " + dish);


        //Parallels Streams (Async)
        System.out.println("-------------Parallels Streams------------");
        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());


        //Min Max
        System.out.println("-------------Min And Max------------");
        dish = dishes.stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println("dish min = " + dish);
        dish = dishes.stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println("dish max = " + dish);


        //Reduce
        System.out.println("-------------Reduce------------");
        int result = dishes.stream()
                .map(Dish::getCalories)
                .reduce(0, (a, b) -> a + b);
        System.out.println("result = " + result);

        //Reduce2
        System.out.println("-------------Reduce2------------");
        result = dishes.stream()
                .map(Dish::getCalories)
                .reduce((a, b) -> a + b)
                .get();
        System.out.println("result = " + result);

        //Count
        System.out.println("-------------Count------------");
        long disCount = dishes.stream().count();
        System.out.println("disCount = " + disCount);


    }
}
