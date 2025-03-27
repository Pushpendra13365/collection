package com.collection;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class HashMap1{
// <> diamond operater
    private static final Logger log = Logger.getLogger(HashMap1.class.getName());

    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Pushpendra");
        map1.put(2, "Raman");
        map1.put(3, "Sita");
        map1.put(4, "Janak");
        HashMap <Integer, String> map2  = new HashMap<>();
        map2.put(3, "Rama");
        map2.put(4, "Sudhir");
        int hashCode = map2.hashCode();
        System.out.println(hashCode);
    }
}