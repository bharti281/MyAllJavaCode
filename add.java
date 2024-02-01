package com.company;
import  java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these number");
        System.out.println(sum);

    }
}
