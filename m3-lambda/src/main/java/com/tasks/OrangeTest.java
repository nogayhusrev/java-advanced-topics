package com.tasks;

import com.nogayhusrev.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange(140, Color.GREEN));
        oranges.add(new Orange(200, Color.RED));
        oranges.add(new Orange(50, Color.GREEN));
        oranges.add(new Orange(150, Color.RED));
        oranges.add(new Orange(140, Color.GREEN));

        System.out.println("Orange and colors");
        prettyPrintOrange(oranges, orange -> {
            String result = "A";
            result += " ";
            result += ((orange.getWeight() < 100)) ? "Light" : "Heavy";
            result += " ";
            result += orange.getColor().toString();
            result += " ";
            result += "Orange";
            return result;
        });

        System.out.println("Oranges and weights");
        prettyPrintOrange(oranges, orange -> "An Orange of " + orange.getWeight() + "g");


    }

    private static void prettyPrintOrange(List<Orange> oranges, OrangeFormatter orangeFormatter) {
        for (Orange orange : oranges) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
