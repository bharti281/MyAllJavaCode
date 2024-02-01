package com.company;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_Scissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '0' for Rock\n, '1' for paper \n '2' for scissors\n");
        int you = sc.nextInt();

        Random no = new  Random();
        int comp = no.nextInt(3);

        if (you == comp){
            System.out.println("Draw");
        }
        else if(you==1 && comp==0 || you==0&&comp==2||you==2&&comp==1){
            System.out.println("you win");
        }
        else {
            System.out.println("computer win");
            System.out.println("you lose");
        }
 if (comp==0){
     System.out.println("computer choose Rock");
 }
        else if (comp==1){
            System.out.println("computer choose paper");
        }

  else {
       System.out.println("computer choose Scissors");
      }


    }
}

