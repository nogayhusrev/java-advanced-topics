package com.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DishData {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );

        System.out.println("-----------------less than 400 calories-------------");
        menu.stream()
                .filter(x -> x.getCalories() < 400)
                .map(x -> x.getName())
                .forEach(System.out::println);

        System.out.println("-----------------length of the name of each dish-------------");
        menu.stream()
                .map(x -> x.getName().length())
                .forEach(System.out::println);

        System.out.println("-----------------Print three high caloric dish name >300-------------");
        menu.stream()
                .sorted((x,y) -> (x.getCalories() < y.getCalories()) ? 1 : -1)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-----------------Print all dish name below 400 calories-------------");
        menu.stream()
                .filter(x -> x.getCalories() < 400)
                .sorted((x,y) -> (x.getCalories() < y.getCalories()) ? -1 : 1)
                .forEach(System.out::println);






    }
}
