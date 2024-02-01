package com.company;
import java.util.HashSet;

public class HAshing {
    public static void main(String[] args) {
        HashSet<Integer>HS= new HashSet<>(6,0.5f);
        HashSet<Integer>HSet= new HashSet<>(6,0.5f);



        HSet.add(5);
        HSet.add(11);
        HSet.add(55);
        HSet.add(56);



        HS.add(8);
        HS.add(7);
        HS.add(9);
        HS.add(12);
        HS.add(56);
        HS.add(45);
        HS.remove(12);
        HS.addAll(HSet);
        System.out.println(HS.contains(9));
        System.out.println(HS.isEmpty());

       // HS.clear();

        System.out.println(HS);
        HS.getClass();

    }
}
