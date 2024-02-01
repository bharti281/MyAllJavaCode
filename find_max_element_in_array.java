package com.company;

public class find_max_element_in_array {
    public static void main(String[] args) {
        int [] arr={54,69,25,78,784,56};
        int max=Integer.MIN_VALUE;
        for(int e : arr){
            if(e>max)
            {
                max=e;
            }
        }
        System.out.println("The maximum no is "+max);
    }
}
