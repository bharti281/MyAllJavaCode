package com.company;

import java.util.Arrays;

public class Array_class {
    public static void main(String[] args) {

//
//        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int index = Arrays.binarySearch(num, 4);
//        System.out.println("The index of element "+index);

        Integer[] num = {11, 12, 31, 14, 55, 86, 72, 18, 19, 10};
        Arrays.sort(num);
       // Arrays.fill(num,12);
        for(int i : num){
            System.out.println(i + " ");
        }


    }
}
