package com.nogayhusrev;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(200, Color.RED));
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(300, Color.RED));
        inventory.add(new Apple(150, Color.GREEN));

        Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());
        //inventory.sort(sortApple);
        System.out.println(inventory);

        Comparator<Apple> sortApple1 = comparing(Apple::getWeight);
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining

        inventory
                .sort(comparing(Apple::getWeight)
                        .thenComparing(Apple::getColor));
        System.out.println(inventory);


    }
}
