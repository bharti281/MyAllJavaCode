package com.company;

import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

    class MyLibrary {
        public ArrayList<Book> Books;

        public MyLibrary(ArrayList<Book> Books) {
            this.Books = Books;
        }


        public void Add_book(Book book) {
            this.Books.add(book);
            System.out.println("The book has been added to the library ");
        }

        public void Return_book(Book b) {
            this.Books.add(b);
            System.out.println("The book has been returned ");

        }

        public void issue_book(Book book, String issued_to) {
            this.Books.remove(book);
            System.out.println("The Book has been issued from the library to " + issued_to);
        }
    }


    public class Library_management_system {
        public static void main(String[] args) {
            ArrayList<Book> bk = new ArrayList<>();
            Book b1 = new Book("C++", "Rema");
            bk.add(b1);
            Book b2 = new Book("Ds", "Rema");
            bk.add(b2);
            Book b3 = new Book("java", "Amit");
            bk.add(b3);
            Book b4 = new Book("c", "E-balaguruswami");
            bk.add(b4);
            Book b5 = new Book("VB.net", "Manish Mishra");
            bk.add(b5);
            MyLibrary l = new MyLibrary(bk);
            l.Add_book(new Book("C++", "Rema"));
            l.issue_book(b3, "Bharti");
            System.out.println(l.Books);

        }

    }


