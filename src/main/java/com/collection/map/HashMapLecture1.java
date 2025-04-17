package com.collection.map;

import java.util.HashMap;

public class HashMapLecture1 {
    public static void main(String[] args) {
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'P');
        map.put(2, 'U');
        map.put(null, null);
        map.put(3, null);
        map.put(4, null);
        System.out.println(map.size());
    }
}
