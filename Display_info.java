package com.company;
import java.util.Scanner;
public class Display_info {
    int roll_no ;
    long contact;
    String  name,email,gender;
    Scanner sc= new Scanner(System.in);
    void display ()
    {
        System.out.println(" Enter your roll number");
        roll_no = sc.nextInt();
        System.out.println("Enter your Contact");
        contact = sc.nextLong();
        System.out.println("Enter your Name");
        name = sc.next();
        System.out.println("Enter your Gender");
        gender = sc.next();
        System.out.println("Enter your email");
        email = sc.next();

    }
    void display2()
    {
        System.out.println(" *********************************************** your information is *********************************************** ");
        System.out.println(roll_no);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(email);
        System.out.println(contact);
    }

    public static void main(String[] args) {
        Display_info obj = new Display_info();
        obj.display();
        obj.display2();
    }
}
