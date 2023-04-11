package com.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CharString {

    public static void main(String[] args) {

        List<String> wordsList = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        wordsList.stream()
                .map(x -> x.length())
                .forEach(System.out::println);

    }
}
