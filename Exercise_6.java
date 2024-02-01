package com.company;

import java.util.Scanner;

public class Exercise_6 {
    int a,b;
    String ch;
    public void ask_input()
    {
        Scanner sc = new Scanner(System.in);
        if(a>100000 || b>100000)
        {
            try {
                throw new max_input();
            }
            catch (max_input i)
            {
                System.out.println(i.toString());
                System.out.println(i.getMessage());
            }

        }
        System.out.println("Enter first number ");
        a = sc.nextInt();
        System.out.println("Enter second number ");
        b = sc.nextInt();

    }


    public void calculator()  {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter (+) for Addition \n Enter (-) for subtraction \n Enter (/) division \n Enter (*) multiplication ");
        System.out.println("Enter your choice ");
        ch = sc.next();

        if (ch.equals("+"))
        {
            ask_input();
            System.out.println(" The result is "+(a+b));
        }
       else if (ch.equals("-"))
        {
            ask_input();
            System.out.println(" The result is "+(a-b));
        }
        else if (ch.equals("*"))
        {
            ask_input();
            System.out.println(" The result is "+(a*b));
        }
        else if (ch.equals("/"))
        {
            ask_input();
            try {
                System.out.println(" The result is " + (a / b));
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
        }
        else {
            try {
                throw new EX_6_Exception();
            }
            catch (EX_6_Exception e)
            {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Exercise_6 EX = new Exercise_6();
        EX.calculator();


    }
}
