package com.company;

import java.util.HashMap;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<Integer,String> Hm = new HashMap<>();
        Hm.put(1,"bharti");
        Hm.put(2,"neha");
        Hm.put(3,"simran");
        Hm.put(4,"golu");
        Hm.put(5,"buuaa");

        Hm.isEmpty();
      //  Hm.clear();
        System.out.println(Hm);
        System.out.println(Hm.containsKey(1));
        System.out.println(Hm.containsValue("bharti"));
        Hm.remove(3,"simran");
        Hm.replace(4,"mohan");
        System.out.println(Hm);

    }
}
