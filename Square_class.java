package com.company;
class Square{
    int side ;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return side*4;
    }
}
public class Square_class {
    public static void main(String[] args) {
        Square Sq = new Square();
        Sq.side=3;
        System.out.println(Sq.area());
        System.out.println(Sq.perimeter());



    }
}
