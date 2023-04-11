package com.nogayhusrev;

public class Main {
    public static void main(String[] args) {
        Currency c = Currency.DIME;

        System.out.println("-----------------------------");
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("-----------------------------");
        System.out.println("How to get all constant:");
        System.out.println("-----------------------------");
        Currency[] currencies = Currency.values();


        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("-----------------------------");
        System.out.println("How to use switch-case with enum:");
        System.out.println("-----------------------------");
        switch (c) {
            case DIME:
                System.out.println("It is 1 cent");
                break;
            case PENNY:
                System.out.println("It is 5 cent");
                break;
            case NICKLE:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

        System.out.println("-----------------------------");
        System.out.println("How to use methods with enum:");
        System.out.println("-----------------------------");
        calculate(3, 5, Operation.DIVIDE);

        System.out.println("-----------------------------");
        System.out.println("How to retrieve the constant value:");
        System.out.println("-----------------------------");
        System.out.println(Currency.PENNY.getValue()); //1
        System.out.println(Currency.PENNY.ordinal());  //0


    }

    private static void calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case DIVIDE:
                System.out.println(x / y);
                break;
            case MULTIPLY:
                System.out.println(x * y);
                break;
        }
    }
}
