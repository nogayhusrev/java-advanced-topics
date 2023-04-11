package com.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith", 45));
        users.add(new User("James", "Evan", 65));
        users.add(new User("Edam", "Smith", 55));


        System.out.println("--------------Print All Elements-----------------");
        Consumer<User> consumer = user -> System.out.println(user);
        print(users, consumer);


        System.out.println("--------------Print Elements Last Name Starts with E -----------------");
        consumer = user -> {
            if (user.getLastName().startsWith("E"))
                System.out.println(user);
        };
        print(users, consumer);

    }

    private static void print(List<User> users, Consumer<User> consumer){
        for (User user : users){
            consumer.accept(user);
        }

    }
}
