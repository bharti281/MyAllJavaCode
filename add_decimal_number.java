package com.company;
import java.util.Scanner;
public class add_decimal_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        float a = sc.nextFloat();
        System.out.println("Enter 2nd number");
        float b = sc.nextFloat();
        float  sum = a+b;
        System.out.println("Result");
        System.out.println(sum);

    }
}

