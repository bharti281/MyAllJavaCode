package com.company;

public class Array_sum {
    public static void main(String[] args) {
        float []arr = {45.0f,56.8f,23.7f,100.4f,58.5f};
        float sum =0;
        for (float element:arr){
            sum+=element;
        }
        System.out.println("The sum is "+sum);
    }
}

