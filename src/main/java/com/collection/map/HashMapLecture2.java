package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapLecture2{

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("A", "Pushpendra");
        map.put("B", "Kushwaha");
        for (String key : map.keySet()){
            map.put("C", "Cherry");
            System.out.println(map);
        }
    }
}
