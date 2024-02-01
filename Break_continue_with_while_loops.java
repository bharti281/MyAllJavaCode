package com.company;

public class Break_continue_with_while_loops {
    public static void main(String[] args) {
        int i=0;
        while (i<5)
        {
            //System.out.println(i);
            //System.out.println("my name is bharti kumai");
            i++;
            if(i==2){
                System.out.println("end loop");
                //break;
                continue;
            }
            System.out.println(i);
            System.out.println("my name is bharti kumai");
        }
    }
}

