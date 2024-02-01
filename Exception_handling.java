package com.company;
import java.util.Scanner;
public class Exception_handling {
    public static void main(String[] args) {

        int []marks = new int[3];
        marks[0]= 55;
        marks[1]=66;
        marks[2]=85;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array index ");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int num = sc.nextInt();
        try
        {
            System.out.println("The value at array index enter is "+marks[ind]);
            System.out.println("The value of array-value/number is  "+marks[ind]/num);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception "+ e);
        }
        catch (ArithmeticException A)
        {
            System.out.println("Arithmetic Exception "+ A);
        }
        catch (Exception e)
        {
            System.out.println("Some Exception occured!");
        }

    }
}
