package com.nogayhusrev.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {

        //Type Inference
        var cydeo = "Cydeo";
        var number = 5;

        byte x = 1;
        var y = 1; //int

        var price = 12.5;


        var numbers = Arrays.asList(3, 4, 5, 6, 7);

        var sum = 0;

        for (var each : numbers) {
            sum += each;
        }


    }
}
