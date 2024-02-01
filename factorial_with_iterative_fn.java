package com.company;

public class factorial_with_iterative_fn {
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            {
                for (int i = 1; i <= n; i++) {
                    product *=i;
                }
                return product;
            }
        }
    }
    public static void main(String[] args) {
            int x =0;
        System.out.println("the factorial of x is "+ factorial_iterative(x));



    }
}
