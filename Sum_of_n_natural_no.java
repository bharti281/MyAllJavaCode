package com.company;

public class Sum_of_n_natural_no {
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;

      }
        return n+sum(n-1);

    }
    public static void main(String[] args) {
        int c=sum(5);
        System.out.println(c);

    }
}
