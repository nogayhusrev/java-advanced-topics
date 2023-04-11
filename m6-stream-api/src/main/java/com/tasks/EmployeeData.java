package com.tasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2132741231", "3141624123")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("2132231231", "31416241233")),
                new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("2132723231", "3141623123"))
        );
    }

}
