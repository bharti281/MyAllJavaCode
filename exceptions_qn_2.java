package com.company;

public class exceptions_qn_2 {
    public static void main(String[] args) {
        try
        {
            int a = 666/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Haha");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("hehe");
        }
    }
}
