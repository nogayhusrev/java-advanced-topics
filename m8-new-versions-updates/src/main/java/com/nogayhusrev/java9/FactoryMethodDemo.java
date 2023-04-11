package com.nogayhusrev.java9;

import java.util.*;

public class FactoryMethodDemo {

    public static void main(String[] args) {


        //Creating unmodifiable List Before Java9
        System.out.println("------------Before Java9-----------");
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));
        // courses.add("python"); gives error
        System.out.println(courses);

        //Creating unmodifiable List After Java9
        System.out.println("------------After Java9-----------");
        List<String> myCourses = List.of("Java", "Spring", "Agile");

        //Creating unmodifiable Set After Java9
        System.out.println("------------After Java9 Creating Set-----------");
        Set<String> myCoursesSet = Set.of("Java", "Spring", "Agile");

        //Creating unmodifiable Set After Java9
        System.out.println("------------After Java9 Creating Set-----------");
        Map<String, Integer> myCart = Map.ofEntries(
                Map.entry("Samsung Tv", 1),
                Map.entry("PSP", 1),
                Map.entry("Chair", 5)
        );


    }
}
