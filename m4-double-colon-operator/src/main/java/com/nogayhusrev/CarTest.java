package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {


        //Zero argument constructor
        Supplier<Car> supplier = () -> new Car();
        System.out.println(supplier.get().getModel());


        Supplier<Car> supplier1 = Car::new;
        System.out.println(supplier1.get().getModel());

        //One argument constructor
        Function<Integer,Car> function = i -> new Car(i);
        Function<Integer,Car> function1 = Car::new;

        //Two argument constructor
        BiFunction<String,Integer,Car> biFunction = (str, i) -> new Car();
        BiFunction<String,Integer,Car> biFunction1 = Car::new;
        Car car = biFunction1.apply("Honda",2022);



    }
}
