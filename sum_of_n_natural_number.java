package com.company;

public class sum_of_n_natural_number {
    static int sum(int n) {
        int sum = 0;
        for(int i = 0; i <=n; i++)
        {
          sum +=i ;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sum(5));
    }
}
