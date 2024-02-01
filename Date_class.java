package com.company;

import java.util.Date;

public class Date_class {
    public static void main(String[] args) {
       // Date D =new Date();
        Date D =new Date(121,8,24);

        System.out.println(D);
        System.out.println(D.getDate());

        System.out.println(D.getMonth());

        System.out.println(D.getYear());
        System.out.println(D.getSeconds());
        System.out.println(D.getTime());
        System.out.println(D.getMinutes());
        System.out.println(D.hashCode());
        System.out.println(D.getTimezoneOffset());




    }
}
