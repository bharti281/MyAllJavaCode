package com.company;
class Circle{
    int r;

    public float area()
    {
        return (float) ((3.14)*r*r);
    }
    public int diameter()
    {
        return 2*r;
    }
}

public class Circle_class {
    public static void main(String[] args) {
        Circle Cir = new Circle();

        Cir.r=5;
        System.out.println((float)Cir.area());
        System.out.println(Cir.diameter());

    }
}
