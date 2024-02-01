package com.company;

public class print_Table_with_fn {
    static void print_table(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.format("%d X %d = %d \n",n,i ,n*i);
        }
    }

    public static void main(String[] args) {

        print_table(5);
    }
}
