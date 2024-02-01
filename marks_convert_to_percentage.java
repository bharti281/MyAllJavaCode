package com.company;
import java.util.Scanner;

public class marks_convert_to_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("marks_convert_to_percentage");
        System.out.println("Enter subject one marks");
        int a = sc.nextInt();
        System.out.println("Enter subject two marks");
        int b = sc.nextInt();
        System.out.println("Enter subject three marks");
        int c = sc.nextInt();
        System.out.println("Enter subject four marks");
        int d = sc.nextInt();
        System.out.println("Enter subject five marks");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("your total marks is ");
        System.out.println(sum);
        int percentage = (sum*100)/500;
        System.out.print("your marks percentage is ");
        System.out.println((float)percentage+"%");
    }
}
