package com.company;

public class Sum_of_even_no {
    public static void main(String[] args) {
        int sum = 0 ;
        int n=5;
        for (int i=0;i<n;i++){
            sum=sum+(2*i);
        }
        System.out.print("The sum of even no is " );
        System.out.print(sum);
    }
}
