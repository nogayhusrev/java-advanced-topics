package com.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class Person {
    private String name;
    private int age;
    private Gender gender;
    private String emailAddress;
}
