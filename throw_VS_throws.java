package com.company;
class Negative_area_Exception extends Exception
{
    public String toString()
    {
        return "Negative area Exception ";
    }
    public String getMassage()
    {
        return "Radius can not ne negative";
    }

}

public class throw_VS_throws {
    public static int div(int a,int b)
            throws ArithmeticException
    {
        return a/b;

    }
    public static double area(int r) throws Negative_area_Exception{
            if(r<0){
        throw new Negative_area_Exception();
    }
            return Math.PI*r*r;
    }

    public static void main(String[] args) {
        int a= 12;
        int b=0;
        try {
            System.out.println(div(a, b));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try{
            System.out.println(area(8));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
