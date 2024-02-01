package com.company;

import java.util.Scanner;

class Marks {
    Scanner Sc = new Scanner(System .in);
    protected
    int[] marks = new int[3];

    public void setMarks() {
        System.out.println("Enter the marks in three subject ");
        for(int i =0;i<marks.length;i++)
        {
            marks[i]= Sc.nextInt();
        }
    }
    void total_marks()
     {
         System.out.println("your total marks "+(marks[0]+marks[1]+marks[2]));
     }

}
class Activities{
    Scanner Sc = new Scanner(System .in);
    protected
    int[] acts = new  int [2];

    public void set_acts_marks() {
        System.out.println("Enter the marks in two activities");
        for(int i =0;i<acts.length;i++)
        {
            acts[i]= Sc.nextInt();
        }
    }
    void total_acts_marks()
    {
        System.out.println("your total marks "+(acts[0]+acts[1]));
    }

}
class Student extends  Marks {
    

}
public class Hybrid_inharitance {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.setMarks();
        m.total_marks();
        Activities Act = new Activities();
        Act.set_acts_marks();
        Act.total_acts_marks();
    }
}
