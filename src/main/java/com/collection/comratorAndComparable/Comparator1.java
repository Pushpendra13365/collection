package com.collection.comratorAndComparable;

import java.util.Arrays;
import java.util.List;

public class Comparator1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pushpendra", "Sita", "Ratan");
        list.sort(null);
        System.out.println(list);
    }
}
