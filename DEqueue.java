package com.company;

import java.util.ArrayDeque;

public class DEqueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> Q = new ArrayDeque<>();
        Q.add(5);
        Q.add(7);
        Q.add(9);
        Q.add(4);
        System.out.println(Q.peek());
        Q.offerFirst(5);
        Q.addFirst(7);
        Q.addLast(12);
        System.out.println(Q.contains(12));
        System.out.println(Q.isEmpty());
        System.out.println(Q);
        //System.out.println(Q.);
       // System.out.println(Q.iterator());
        //System.out.println(DEqueue);
//        for(int i =0;i<Q.size();i++)
//        {
//            System.out.print(Q.containsAll(i));
//            System.out.print(" ,");
//        }


    }
}
