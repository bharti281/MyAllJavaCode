package com.company;

public class variable_Argument_with_mul {
    static int mul(int x ,int ...arr)
    {
        int result=x;
        for(int a :arr)
        {
            result *=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The Multiplication of these number "+mul(5,3,8));
       // System.out.println("The Multiplication of these number "+mul());
    }
}
