package com.nogayhusrev;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 3, 5, 7, 8, 2, 234, 23, 5, 2);

        //empty() - isPresent()
        System.out.println("---------------empty() - isPresent()-------------");
        Optional<String> empty = Optional.empty();
        System.out.println("empty = " + empty);
        System.out.println("empty.isPresent() = " + empty.isPresent());


        //ifPresent
        System.out.println("---------------ifPresent()-------------");
        Optional<Integer> bigNumber = number.stream().filter(x -> x > 100).findAny();
        bigNumber.ifPresent(System.out::println);

        //get
        System.out.println("---------------get()-------------");
        System.out.println(bigNumber.get());


        //orElse
        //get
        System.out.println("---------------orElse()-------------");
        System.out.println(bigNumber.orElse(5));


    }
}