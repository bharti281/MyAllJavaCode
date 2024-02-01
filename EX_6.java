package com.company;

import java.util.Scanner;

public class EX_6 {
    String Ch;
    int a;
    int b;
public static int max(int a ,int b) {
    if ( a >= 100000 || b >=  100000) {
        try
        {
            throw new max_input();
        }
        catch(max_input e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
    return 0;

}
    public void calculator()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        Ch = sc.nextLine();

        switch(Ch) {
            case("+"):
                System.out.println("Enter first number ");
                 a = sc.nextInt();
                System.out.println("Enter second number ");
                 b= sc.nextInt();

                System.out.println("your result is "+( a+b));
                max(a,b);

            case("-"):
                System.out.println("Enter first number ");
                a = sc.nextInt();
                max(a,b);

                System.out.println("Enter second number ");
                b= sc.nextInt();
                System.out.println("your result is "+( a-b));
            case("*"):
                System.out.println("Enter first number ");
                a = sc.nextInt();
                max(a,b);
                System.out.println("Enter second number ");
                b= sc.nextInt();
                System.out.println("your result is "+( a*b));
            case("/"):
                    System.out.println("Enter first number ");
                    a = sc.nextInt();
                max(a,b);

                System.out.println("Enter second number ");
                    b = sc.nextInt();

                    System.out.println("your result is " + (a/ b));
                    try{
                    throw new Can_not_div_0_exp ();
                }
                catch (Can_not_div_0_exp e)
                {
                    System.out.println( e.getMessage());
                    System.out.println(e.toString());
                }

                break;
            default:
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
        System.out.println(" Enter (+) for Addition \n Enter (-) for subtraction \n Enter (/) division \n Enter (*) multiplication ");
        EX_6 ex = new EX_6();
        ex.calculator();

    }
}
