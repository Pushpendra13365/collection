package com.collection.set;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        TreeSet<String> hs = new TreeSet<>();
        hs.add("Ram");
        hs.add("Rama");
//        hs.add(null);
        System.out.println(hs);
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Pushpendra");
        hs1.add("Rajat");
        //boolean addAll = hs.addAll(hs1);
        //hs.clear();
        //boolean contains = hs.contains("Rama");
        boolean containsAll = hs.containsAll(hs1);
        System.out.println(containsAll);
    }
}
