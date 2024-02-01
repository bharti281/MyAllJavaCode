package com.company;

public class print_pattern_2 {
    static void print_pattern(int n)
    {
        for(int i=0 ;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
            System.out.print("*");
            }

            System.out.println();

        }
    }
    public static void main(String[] args) {
         print_pattern(5);

    }
}
