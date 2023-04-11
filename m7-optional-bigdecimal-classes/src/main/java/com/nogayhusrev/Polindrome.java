package com.nogayhusrev;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        int raminder, temp;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int number = scanner.nextInt();

        temp = number;

        while (number > 0) {
            raminder = number % 10;
            sum = (sum * 10) + raminder;
            number = number / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}

