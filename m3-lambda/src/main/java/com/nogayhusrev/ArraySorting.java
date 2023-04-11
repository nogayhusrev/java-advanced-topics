package com.nogayhusrev;

public class ArraySorting {
    public static void main(String[] args) {


        ArraySorting as = new ArraySorting();
        as.sort(new QuickSort());
        as.sort(new BubbleSort());
        System.out.println("-----------With Lambda Expressions----------------");
        Sorting quicksort = () -> System.out.println("Quick Sorting");
        // as.sort(quicksort);
        as.sort(() -> System.out.println("Quick Sorting"));


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}

