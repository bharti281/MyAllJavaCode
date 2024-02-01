package com.company;

public class print_pattern_with_while_loop {
    public static void main(String[] args) {

        int i=5;
        while(i>0)
        {
            i--;
            int j=0;
            while (j<i)
            {
                j++;
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
