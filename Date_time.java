package com.company;

public class Date_time {
    public static void main(String[] args) {
        System.out.println("milisecond"+System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(System.currentTimeMillis()/1000/3600);
        System.out.println(System.currentTimeMillis()/1000/3600/24);

        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

    }
}
