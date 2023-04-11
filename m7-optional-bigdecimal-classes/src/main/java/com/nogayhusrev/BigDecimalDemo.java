package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2); // 0.30

        //BigDecimal
        System.out.println("-------------BigDecimal----------");
        BigDecimal d1 = new BigDecimal("374.56");
        BigDecimal d2 = new BigDecimal("374.26");
        BigDecimal d3 = BigDecimal.valueOf(374.56);
        BigDecimal d4 = BigDecimal.valueOf(374.26);
        BigDecimal d5 = BigDecimal.TEN;
        System.out.println(d1.subtract(d2));
        System.out.println(d3.subtract(d4));
        System.out.println(d5);
        System.out.println(d1.multiply(d2));

        //Scaling
        System.out.println("------------Scaling----------");
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.DOWN));
        System.out.println(number1.setScale(1, RoundingMode.UP));


        //Do not use equals(). Use compareTo()
        System.out.println("------------------compareTo()--------------");
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("3")));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("4").compareTo(new BigDecimal("3")));


    }
}
