package com.nogayhusrev;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 73, 23, 46, 323, 42);
        System.out.println(list);

        //Ascending
        Collections.sort(list);
        System.out.println(list);

        //Descending
        Collections.sort(list, (ob1, ob2) -> {
            if (ob2 > ob1)
                return 1;
            else if (ob1 > ob2)
                return -1;
            else
                return 0;
        });
        System.out.println(list);

        Collections.sort(list, new MyComparator());
        System.out.println(list);

        //Ascending order
        list.sort(((o2, o1) -> o1.compareTo(o2)));
        System.out.println(list);

        list.sort(Integer::compareTo);
        System.out.println(list);
    }
}
