package com.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Person p1 = new Person("Mike", 34, Gender.MALE, "mike@gmail.com");
        Person p2 = new Person("Ozzy", 24, Gender.MALE, "mike@gmail.com");
        Person p3 = new Person("Tom", 34, Gender.MALE, "mike@gmail.com");
        Person p4 = new Person("Mikeş", 24, Gender.MALE, "mike@gmail.com");
        Person p5 = new Person("Mikel", 34, Gender.MALE, "mike@gmail.com");

        List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
        print(people, p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE);
    }

    private static void print(List<Person> people, CheckMember checkMember) {

        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (checkMember.test(person))
                result.add(person);
        }
        System.out.println(result);
    }
}
