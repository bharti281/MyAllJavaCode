package com.company;

public class factorial_using_while_loop {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int factorial=1;
        while(i<=n){
            factorial*=i;
            i++;
        }
        System.out.println(factorial);
    }
}
