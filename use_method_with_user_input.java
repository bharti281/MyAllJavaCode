package com.company;
import java.util.Scanner;

public class use_method_with_user_input {
    static int sum(int a ,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a= sc.nextInt();
        System.out.println("Enter your second number");
        int b= sc.nextInt();
        System.out.println("your result is "+sum(a,b));



    }
}
