package com.company;
import java.util.Scanner;
public class Find_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int remainder = a%b;
        System.out.println("Result");
        System.out.println(remainder);

    }
}
