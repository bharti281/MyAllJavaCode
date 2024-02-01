package com.company;

import java.util.Scanner;

class myException extends  Exception
{
    public String toString()
    {
        return"I am to string()";


    }
    public String getMessage()
    {
        return "I am getMessage()";
    }


}
public class Exception_class {
    public static void main(String[] args) {
        int a=8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        if(a<9) {
            try {


                throw new myException();
            }
        catch(Exception e)

            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }

    }
}
