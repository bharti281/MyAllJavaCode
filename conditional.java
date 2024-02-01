package com.company;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age>18) {

            System.out.println("you can drive");
        }
        else{
            System.out.println("you can not drive");
        }




    }
}
