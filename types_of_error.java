package com.company;

import java.util.Scanner;

//Type of Error
public class types_of_error {
    public static void main(String[] args) {
          //    int a //<----------- syntax Error(many type of syntax error)
       // System.out.println(2);
       // for (int i =1; i<5;i++)   //<------------- logical Error
        //{
           // System.out.println(2*i+1);
       // }

      int a ;
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();

            System.out.println("Integer part part of 1000 divided by a is " + 1000 / a);

        }
        catch (Exception e)
        {
            System.out.println(" invalid input");
        }
    }
}
