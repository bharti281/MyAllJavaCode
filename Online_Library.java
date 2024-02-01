package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Online_Library{
   String []books;
   int countBook;
   Scanner sc=new Scanner(System.in);
    Online_Library()
    {

        this.books =new String[100]  ;
        this.countBook=0;
       // this.books[0]="my name kon";
        //this.books[1]="Dr Rajendra prshad";
        //this.books[2]="ANSI C";
        //this.books[3]="Let US C";
        //this.books[4] ="Object oriented programming in C++";

    }
    public void addBook( String book)
    {
        this.books[countBook]=book;
        countBook++;
        System.out.println(book+" has been added!");
    }
    public void issueBook(String book)
    {
       for (int i=0;i<this.books.length;i++)
       {
           if (this.books[i].equals(book)) {
               System.out.println("The Book has been issued!");
               this.books[i] = null;
               return;
           }
           System.out.println("This book does not exist");
       }
    }
    void returnBook(String book)
    {
        this.books[countBook] = book   ;
        countBook++;
    }
   
    public void traversal() {
        System.out.println("Available Books are:");

        for (String book : this.books) {
            if(book==null)
            {
                continue;
            }

            System.out.println("* "+ book);
        }
      
    }
    public static void main(String[] args) {
        Online_Library Library =new Online_Library();
        Library.addBook("C++");
        Library.addBook("C");
        Library.addBook("Let us c");
        Library.addBook("Object oriented programming in C++");
        Library.traversal();

        Library.issueBook("C");


        Library.traversal();
        Library.returnBook("C++");
                Library.traversal();



    }

}
