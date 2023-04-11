package com.nogayhusrev.tasks;

import java.util.Arrays;

public class SwapTask {
    public static void main(String[] args) {


        Integer[] a = {1, 2, 3, 4, 5};
        System.out.println("-----------------------");
        System.out.println("Before swapping:");
        System.out.println(Arrays.toString(a));


        swap(a, 0, 2);

        System.out.println("-----------------------");
        System.out.println("After swapping:");
        System.out.println(Arrays.toString(a));
    }

    private static <T> void swap(T[] a, int i, int j) {

        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
