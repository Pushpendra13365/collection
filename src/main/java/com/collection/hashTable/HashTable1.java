package com.collection.hashTable;

import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        // it is syncronized it is thread safe it's implementing map interface, here key null is not allowed also value,
        // it's a lagacy classes but now replace with concurrentHashMap, slower than HashMap cause thread safe,
        hashtable.put(1,"Banana");
        hashtable.put(3,"Pine-Apple");
        hashtable.put(2,"Apple");

        System.out.println(hashtable);
    }
}
