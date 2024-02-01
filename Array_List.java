package com.company;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> L1 =new ArrayList<>();
        ArrayList<Integer> L2=new ArrayList<>(5);
        L2.add(45);
        L2.add(78);
        L2.add(56);
        L2.add(74);
        L2.add(14);

        L1.add(5);
        L1.add(6);
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add(6);

        L1.add(0,9);
        L1.add(0,8);
       // L1.addAll(L2);
        L1.addAll(0,L2);
       // L1.clear();  <<-------- to clear Array
        L1.remove(4);
        System.out.println(L1.indexOf(6));
        System.out.println(L1.lastIndexOf(6));
        System.out.println(L1.contains(6));
        L1.set(1,566);
        System.out.println( L1.isEmpty());
        System.out.println(L1.subList(6,10));
        System.out.println(L1.stream());


        for(int i =0;i<L1.size();i++)
        {
            System.out.print(L1.get(i));
            System.out.print(" ,");
        }
    }
}
