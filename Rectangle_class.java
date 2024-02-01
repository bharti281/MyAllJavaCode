package com.company;
class Rectangle{
    int l;
    int w;
    public int area()
    {
        return l*w;
    }

    public int perimeter()
    {
        return 2*(l+w);
    }

}

public class Rectangle_class {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.l=5;
        rec.w=6;
        System.out.println("Area of rectangle "+rec.area());
        System.out.println("perimeter of rectangle "+rec.perimeter());

    }
}
