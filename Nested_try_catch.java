package com.company;
import java.util.Scanner;
public class Nested_try_catch {
    public static void main(String[] args) {
        int [] arr = new int[4];
        arr [0]=89;
        arr[1]=55;
        arr[2]=45;
        arr[3]=78;
        boolean flag = true;
                while(flag){
                    System.out.println("Enter index number ");
                    Scanner sc = new Scanner(System.in);
                    int ind = sc.nextInt();
                    try {
                        System.out.println("welcome my program ");
                        try {
                            System.out.println(arr[ind]);
                            flag = false;
                        }
                        catch (ArrayIndexOutOfBoundsException e)
                        {
                            System.out.println("Index not found " + e);
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
        System.out.println("Thank for using program ");

    }
}
