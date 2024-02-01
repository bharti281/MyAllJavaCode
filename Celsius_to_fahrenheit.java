package com.company;

public class Celsius_to_fahrenheit {
    static  void fahrenheit(float c)
    {
        if (c==0)
        {
            System.out.println(" 32 fahrenheit");
        }
        else
        {
          float f=(c*9/5)+32;
            System.out.println(f+" fahrenheit");
        }

    }
    public static void main(String[] args) {
        fahrenheit((float) 10.6);
    }
}
