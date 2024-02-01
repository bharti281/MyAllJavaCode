package com.company;
import java.util.Scanner;
public class else_if_clause {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>56)
        {
            System.out.println("you are experience");
        }
       else if(age>46)
        {
            System.out.println("you are semi-experience");
        }
        else if(age>36)
        {
            System.out.println("you are semi-semi-experience");
        }
        else{
            System.out.println("You are not experience");
        }

    }
}
