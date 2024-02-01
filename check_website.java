package com.company;
import java.util.Scanner;
public class check_website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website");
        String web = sc.next();

        if(web.endsWith(".com")){
            System.out.println("This is a commercial website");

        }
       else if(web.endsWith(".org")){
            System.out.println("This is a organisation website");

        }
        else if (web.endsWith(".in")){
            System.out.println("This is a indian website");

        }

    }
}
