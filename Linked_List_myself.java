package com.company;

import java.util.LinkedList;

public class Linked_List_myself {
    public static void main(String[] args) {
        LinkedList<Integer> L1 =new LinkedList<>();
        L1.add(8);
        L1.add(5);
        L1.add(9);
        L1.add(7);
        L1.add(0,9);
        L1.addFirst(5);
        L1.addLast(74);
        L1.remove(5);
       // L1.clear();
        System.out.println(" if contains of  6 "+ L1.contains(6));
        System.out.println("fist element of list "+L1.getFirst());
        System.out.println("last element of list "+L1.getLast());
        System.out.println(" index of 74 = "+L1.indexOf(74));
        System.out.println("last index of 9 = " +L1.lastIndexOf(9));
        L1.offerFirst(9);
        L1.offerLast(24);
        System.out.println(L1.element());
        System.out.println(L1.peek());
        System.out.println(L1.set(0,5));
        System.out.println(L1.subList(0,6));
    for(int i =0;i<L1.size();i++)
        {
            System.out.print(L1.get(i));
            System.out.print(",");

        }

    }
}
