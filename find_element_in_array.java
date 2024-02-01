package com.company;
import java.util.Scanner;
public class find_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        boolean isInArray = false;
        int [] arr={45,56,23,78,96};
        for (int element:arr)
        {
            if(num == element){
                isInArray=true;
                break;

            }
        }
        if (isInArray){
            System.out.println("The value is present in array");

        }
        else {
            System.out.println("The value is not present in array");
        }


    }
}
