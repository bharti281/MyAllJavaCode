package com.company;
import java.util.Scanner;
public class marks_pass_faill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // byte s1,s2,s3;
        System.out.println("Enter your hindi marks");
        byte s1 = sc.nextByte();
        System.out.println("Enter your English marks");
        byte s2 = sc.nextByte();
        System.out.println("Enter your math marks");
        byte s3 = sc.nextByte();
        float avg = (s1+s2+s3)/3.0f;
        System.out.println("your percentage is" +avg);

        if(avg>=40 && s1>=33 && s2>=33 && s3>=33)
        {
            System.out.println("you are pass");
        }
        else {
            System.out.println("your are fail");
        }


    }
}
