package com.tasks;


import lombok.*;

@Data // @Getter @Setter @ToString
@AllArgsConstructor
//@NoArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private int age;

}
