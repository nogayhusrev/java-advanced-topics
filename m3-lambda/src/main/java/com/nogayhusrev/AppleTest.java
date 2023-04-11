package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(400,Color.GREEN));
        inventory.add(new Apple(300,Color.RED));
        inventory.add(new Apple(150,Color.GREEN));



        System.out.println(filterApples(inventory, new AppleGreenColorPredicate()));
        System.out.println(filterApples(inventory, new AppleHeavyPredicate()));




    }

    private static List<Apple> filterApples(List<Apple> inv, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inv){
            if (applePredicate.test(apple))
                result.add(apple);
        }

        return result;
    }
}
