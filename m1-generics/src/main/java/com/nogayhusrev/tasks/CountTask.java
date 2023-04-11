package com.nogayhusrev.tasks;

import java.util.Arrays;
import java.util.List;

public class CountTask {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);


        print(ci);
    }

    private static <T> int countIf(List<T> ci, UnaryPredicate<T> predicate) {
        int count = 0;
        for (T e : ci) {
            count += (predicate.test(e)) ? 1 : 0;
        }

        return count;
    }

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}

interface UnaryPredicate<T> {
    public boolean test(T obj);
}

class OddPredicate implements UnaryPredicate<Integer> {
    @Override
    public boolean test(Integer obj) {
        return obj % 2 != 0;
    }
}



