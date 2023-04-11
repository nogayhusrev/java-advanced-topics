package com.cydeo;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //Creating Stream from Array

        String[] courses = {"Java", "Spring", "Agile"};

        Stream<String> coursesStream = Arrays.stream(courses);

        //Creating Stream from collection

        List<String> courseList = Arrays.asList(courses);
        Stream<String> coursesStream2 = courseList.stream();


        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("Ds",101),
                new Course("Ms",102)
        );

        Stream<Course> myCoursesStream = myCourses.stream();

        //Creating Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,3,4,234,12,3412,31,23,1231);




    }
}