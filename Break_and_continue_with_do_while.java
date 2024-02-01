package com.company;

public class Break_and_continue_with_do_while {
    public static void main(String[] args) {
        int i=0;
        do {
           // System.out.println(i);
            //System.out.println("my name is bharti kumari");
            i++;
            if(i==2){
                System.out.println("end loop");
                //break;
                continue;
            }
            System.out.println(i);
            System.out.println("my name is bharti kumari");

        }while (i<5);


    }
}
