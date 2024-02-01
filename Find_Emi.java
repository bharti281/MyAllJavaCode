package com.company;

import java.util.Scanner;

public class Find_Emi {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter principal ");
        double p =Sc.nextDouble();
        System.out.println("Enter rate");
        double r =Sc.nextDouble();
        System.out.println("Enter time ");
        double T = Sc.nextDouble();
        r=r/(12*100);
        T=T*12;
        double emi =(p*r*Math.pow(1+r,T))/(Math.pow(1+r,T)-1);
        System.out.println("EMI is "+emi);
    }
}
