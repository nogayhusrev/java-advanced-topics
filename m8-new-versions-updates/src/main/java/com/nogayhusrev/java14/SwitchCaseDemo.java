package com.nogayhusrev.java14;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int month = 10;

        String result = "";

        switch (month) {

            case 2:
                result = "28 days";
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;

            default:
                result = "Invalid number";
        }

        System.out.println(result);

        System.out.println("-------------------------");

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("This month has 31 days");
            case 4, 6, 9 -> System.out.println("This month has 30 days");
            case 2 -> System.out.println("This month has 28 or 29 days");
            default -> System.out.println("Invalid ınput");
        }
        System.out.println("----------------------");


        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9 -> 30;
            case 2 -> 29;
            default -> 0;
        };

        System.out.println(day);
        System.out.println("----------------------");

        System.out.println(switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9 -> 30;
            case 2 -> 29;
            default -> 0;
        });

        System.out.println("----------------------");
        month = 2;
        int day2 = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9 -> 30;
            case 2 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter year:");
                int year = scanner.nextInt();
                if (year % 4 == 0)
                    yield 29;
                else
                yield 28;
            }
            default -> 0;
        };

        System.out.println(day2);

    }
}
