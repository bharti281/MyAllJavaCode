package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection_frem {
    public static void main(String[] args) {
        ArrayList<Integer> L1 =new ArrayList<>();
        L1.add(5);
        L1.add(6);
        L1.add(2);
        L1.add(3);
        L1.add(6);
        System.out.println("Min element "+ Collections.min(L1));
        System.out.println("Min element "+ Collections.max(L1));
        System.out.println("Min element "+ Collections.frequency(L1,5));
        Collections.sort(L1, Comparator.reverseOrder());
        System.out.println(L1);

    }
}
