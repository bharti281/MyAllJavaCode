package com.company;
class poly
{
    public int sum(int a , int b)
    {
         return a+b;

    }
    public int   sum(int a , int b ,int c)
    {
        return a+b+c;

    }

}

public class compile_time_polymorphism {
    public static void main(String[] args) {
        poly morph = new poly();
        System.out.println( "sum of these number " +morph.sum(5,8));
        System.out.println( "sum of these number "+morph.sum(5,8,6));


    }
}
