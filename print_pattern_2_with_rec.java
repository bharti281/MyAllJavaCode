package com.company;

public class print_pattern_2_with_rec {
        static  void pattern2(int n)
        {
            if(n>0)
            {
                    for(int i=0;i<n;i++)
                    {
                        System.out.print("*");
                    }

                System.out.println();
                pattern2(n-1);
            }
        }
        public static void main(String[] args) {
            pattern2(5);

        }
    }


