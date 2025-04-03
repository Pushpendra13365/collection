package com.collection.hashTable;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
//        Hashtable<Integer, String> hashtable = new Hashtable<>();
//        // it is syncronized it is thread safe it's implementing map interface, here key null is not allowed also value,
//        // it's a lagacy classes but now replace with concurrentHashMap, slower than HashMap cause thread safe,
//        // only linkedlist is used if collision
//        hashtable.put(1,"Banana");
//        hashtable.put(3,"Pine-Apple");
//        hashtable.put(2,"Apple");
//        hashtable.put(5, "JackFruit");
//        System.out.println(hashtable);
        Hashtable<Integer, String> map = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
           for (int i = 0; i< 1000; i++){
                map.put(i, "Thread1");
           }
        });
        Thread thread2 = new Thread(() -> {
           for (int i = 1000; i < 2000; i++){
               map.put(i,"Thread2");
           }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Final size of Hashmap: " +map.size() );
    }
}
