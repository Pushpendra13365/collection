package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer i = list.get(0);
        System.out.println(i);
        Integer remove = list.remove(1);
        System.out.println(list);
//        Integer i = list.get(0);
//        System.out.println(i);
    }
}
