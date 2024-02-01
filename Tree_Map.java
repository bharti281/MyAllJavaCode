package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        Map<String,Integer> num = new TreeMap<>();
        num.put("one",1);
        num.put("Two",2);
        num.put("Three",3);
        num.put("Four",4);
        num.put("Five",5);
        num.putIfAbsent("Two",2);
        num.remove("Three");

        System.out.println(num);
        num.putIfAbsent("six",6);
        for(Map.Entry<String,Integer> e:num.entrySet()){
            System.out.println(e);
            System.out.println(e.getValue());
            System.out.println(e.getKey());
        }
        for(String Key :num.keySet()){
            System.out.println(Key);
        }
        for(Integer value :num.values()){
            System.out.println(value);
        }
        System.out.println(num.containsValue(3));
        System.out.println(num.isEmpty());
        num.clear();
    }

}
