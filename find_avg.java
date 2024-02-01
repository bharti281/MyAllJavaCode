package com.company;
public class find_avg {
    static int avg(int ...arr){

     int sum = 0;
        for(int i :arr)
        {
             sum= sum+i;
        }

        return sum/arr.length;
    }

    public static void main(String[] args) {
        System.out.println("The avg of number is "+avg(4,6,8,6));


    }
}
