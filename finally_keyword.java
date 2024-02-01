package com.company;

public class finally_keyword {
    public static int div()
    {
        try {
            int a=50;
            int b=10;
            int c =a/b;
            return c;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println(" i am finally keyword");
        }

        return -1;
    }
    public static void main(String[] args) {
        int a =2;
        int b=6;
        System.out.println( div());
      while(true)
      {
          try {
              System.out.println(a/b);
          }
          catch(Exception e){
              System.out.println( e);
              break;
      }
          finally {
              System.out.println("I am finally for value of B = "+b);
          }
          b--;
      }
    }
}
