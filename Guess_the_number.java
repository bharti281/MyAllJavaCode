package com.company;
import java.util.Scanner;
import java.util.Random;

class Game{
    int comp;
    int input;
    int NoGuess=1;
    Game()
    {
        Random no = new  Random();
         comp = no.nextInt(100);
        //System.out.println(comp);

    }
    public void user_Input()
    {
        Scanner Sc =  new Scanner(System.in);
       System.out.println("Guess the number between 1 to 100");
         input = Sc.nextInt();
    }
    public void is_Correct() {
        do {
             user_Input();
            if (comp>input)
            {
                System.out.println("Higher number please!");
            }
            else if(comp<input)
            {
                System.out.println("Lower number please!");
            }
            else
            {
                System.out.println("you win");
            }
            NoGuess++;
        }while(comp != input);


    }
    public void  display()
    {

        System.out.println(" you guessed it in attempts " + NoGuess);
    }

}
public class Guess_the_number {
    public static void main(String[] args) {
        Game gussNumber = new Game();
        gussNumber.is_Correct();
        gussNumber.display();

    }
}
