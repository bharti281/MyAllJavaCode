package com.company;
class MyRectangle
{
    private int length;
    private int breadth;

    public MyRectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength()
    {
        return length;
    }

    public int getBreadth() {

        return breadth;
    }
}
public class rectangle {
    public static void main(String[] args) {
        MyRectangle rec=new MyRectangle();
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());


    }
}
