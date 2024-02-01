package com.company;
import java.util.Scanner;
public class print_days_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day no.");
        int day = sc.nextInt();
        switch (day) {
            case (1) -> System.out.println("Monday");
            case (2) -> System.out.println("tuesday");
            case (3) -> System.out.println("Wednesday");
            case (4) -> System.out.println("Thursday");
            case (5) -> System.out.println("friday");
            case (6) -> System.out.println("Saturday");
            case (7) -> System.out.println("sunday");
            default -> System.out.println("wrong input");
        }






    }
}
