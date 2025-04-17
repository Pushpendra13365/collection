package com.collection.list;

import java.util.ArrayList;
import java.util.List;
// list follows the insertion order process, it stores duplicate element also store null value, random acces is possible
// depending on the implementation.
public class List2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //System.out.println(list);

        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);

        //System.out.println(list);

        list.add(1);

        //System.out.println(list);

        System.out.println(list.get(0));
    }
}
