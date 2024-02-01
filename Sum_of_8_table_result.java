package com.company;

public class Sum_of_8_table_result {
    public static void main(String[] args) {
        int n=8;
       int sum = 0;
        for(int i=1;i<=10;i++)
        {
            sum+=(n*i);
        }
        System.out.println(sum);
    }
}
