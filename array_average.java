package com.company;

public class array_average {
    public static void main(String[] args) {
        int sum =0;
        int [] arr={56,42,28,47,25,45};
        for (int element:arr)
        {

            sum+=element;
        }
        System.out.println("The average of array :- \t"+sum/arr.length);
    }
}

