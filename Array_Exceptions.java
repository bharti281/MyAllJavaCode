package com.company;

import java.util.Scanner;

public class Array_Exceptions {
    public static void main(String[] args) {
        boolean flag = true;
        int [] marks = new int [3];
        marks[0]=78;
        marks[1]=88;
        marks[2]=77;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index number ");
        int index ;
int i =0;
        while (flag && i<5)
        {
            try {
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;

            } catch (Exception e) {
                System.out.println("Invaild index");
                i++;
            }
        }
        if(i>=5)
        {
            System.out.println("Error");
        }

    }

}
