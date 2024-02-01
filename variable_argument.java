package com.company;

public class variable_argument {
    static  int sum(int...arr){
       int  result=0;
        for (int a: arr)
        {
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of these number "+sum(5, 6 , 8 , 9 ));
        System.out.println("the sum of nothing number "+sum());


    }
}
