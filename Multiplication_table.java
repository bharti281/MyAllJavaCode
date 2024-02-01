package com.company;
import java.util.Scanner;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = Sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",a,i,a*i);

        }



    }
}
