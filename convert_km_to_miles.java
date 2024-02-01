package com.company;
import  java.util.Scanner;

public class convert_km_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter kilo Miter");
        float km = sc.nextFloat();
        float m = km*1000;
        System.out.println(m);

    }
}
