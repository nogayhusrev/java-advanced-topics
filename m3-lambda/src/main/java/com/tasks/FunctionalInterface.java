package com.tasks;

import com.cydeo.Apple;
import com.cydeo.ApplePredicate;
import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {

        ApplePredicate applePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

        //****************PREDICATE****************//
        System.out.println("****************PREDICATE****************");
        Predicate<Integer> lesserThan = i -> i<12;
        System.out.println(lesserThan.test(20));

        lesserThan = i -> i == 20;
        System.out.println(lesserThan.test(20));

        //****************CONSUMER****************//
        System.out.println("****************CONSUMER****************");
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(400,Color.GREEN));
        inventory.add(new Apple(300,Color.RED));

        Consumer<Apple> consumer = apple -> System.out.println(apple);
        inventory.forEach(consumer);

        //****************BI CONSUMER****************//
        System.out.println("****************Bi CONSUMER****************");

        BiConsumer<Integer,Integer> biConsumer = (x,y) -> System.out.println("x + y = " + (x+y));
        biConsumer.accept(23,23);

        //****************FUNCTION****************//
        System.out.println("****************FUNCTION****************");
        Function<String,String> function = s -> "Hello " + s ;
        System.out.println(function.apply("Adam"));

        //****************BI FUNCTION****************//
        System.out.println("****************BI FUNCTION****************");
        BiFunction<Integer,Integer,Integer> biFunction = (i, j) -> i+j ;
        System.out.println(biFunction.apply(4,6));

        //****************SUPPLIER****************//
        System.out.println("****************SUPPLIER****************");
        Supplier<String> supplier = () -> "Math.random()";
        System.out.println(supplier.get());




    }
}
