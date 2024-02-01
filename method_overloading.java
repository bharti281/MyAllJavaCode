package com.company;

public class method_overloading {
      static void foo()
      {
          System.out.println("Good morning sis!");
      }
    static void foo(int a)
    {
        System.out.println("Good morning "+a+ "sis!");
    }
    static void foo(int a,int b)
    {
        System.out.println("Good morning "+a+ "sis!");
        System.out.println("Good morning "+b+ "sis!");
    }
    public static void main(String[] args) {
          foo();
          foo(10);
          foo(10,20);

    }
}
