package com.company;
import java.util.Scanner;
public class chek_leap_yr_or_not {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your year");
        int yr = sc.nextInt();
        if ((yr%4==0 )&&(( yr%400==0 )||(yr%100!=0)))
        {
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is a common year");
        }

    }
}
