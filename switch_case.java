package com.company;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        System.out.println("Enter  your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case (18):
                System.out.println("you are going to become an Adult");
                break;
            case (23):
                System.out.println("you are going to join a job");
                break;
            case (60):
                System.out.println("you are going to get retires!");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }




    }
}
