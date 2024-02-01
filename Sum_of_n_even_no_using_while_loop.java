package com.company;

public class Sum_of_n_even_no_using_while_loop {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int i=1;
        while (i<n){
            sum=sum+(2*i);
            i++;
        }
        System.out.print("The sum of n even number ");
        System.out.print(sum);
    }
}
