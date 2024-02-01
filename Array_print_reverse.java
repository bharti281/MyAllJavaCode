package com.company;

public class Array_print_reverse {
    public static void main(String[] args) {
        int[] marks={25,56,48,95,23};
       // System.out.println(marks.length);
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
    }
}
