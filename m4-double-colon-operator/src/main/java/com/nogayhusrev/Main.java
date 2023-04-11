package com.nogayhusrev;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Calculate sum = (n1, n2) -> System.out.println((n1 + n2));

        Calculate sum1 = (n1, n2) -> Calculator.findSum(n1, n2);


        //Reference to a Static Method
        Calculate sum2 = Calculator::findSum;
        sum2.calculate(10, 12);

        //Reference to an instance Method
        Calculate sum3 = new Calculator()::findMultiply;
        sum2.calculate(10, 12);


        //Functional interface
        BiFunction<String, Integer, String> apply = String::substring;
        System.out.println(apply.apply("dsafnşa", 2));


        Function<Integer, Double> func = new MyCLass()::method;
        BiFunction<MyCLass, Integer, Double> apply1 = MyCLass::method;

        Consumer<Integer> display = System.out::println;


    }
}