package com.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(12, 31, 23, 4, 5, 34, 6, 2, 321, 51, 41, 4, 1);

        int sum = 0;

        for (int number : numbers)
            sum += number;

        System.out.println("sum = " + sum);

        //Reduce
        System.out.println("-------------Reduce------------");
        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("result = " + result);

        //Reduce2
        System.out.println("-------------Reduce2------------");
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a + b);
        System.out.println("result2 = " + result2);


        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);

        System.out.println("max = " + max);
        System.out.println("sum = " + sum2);
        System.out.println("min = " + min);
        System.out.println();
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum2.get());
        System.out.println("min = " + min.get());


        //Count


    }
}
