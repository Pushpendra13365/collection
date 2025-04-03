package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pushpendra");
        list.add("Kushwaha");
        list.add("Rama");
        Collections.sort(list);
        for (String element :list){
            System.out.println(element);
        }

    }
}
