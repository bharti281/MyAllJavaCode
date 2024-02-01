package com.company;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash_set {
    public static void main(String[] args) {
        Set<Integer>set = new LinkedHashSet<>();
        set.add(32);
        set.add(2);
        set.add(32);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);
        set.remove(54);
        System.out.println(set);
        System.out.println(set.contains(100));
        System.out.println(set.contains(32));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
