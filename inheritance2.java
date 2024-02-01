package com.company;
class Circle1 {
    int radius ;
    Circle1(int r)
    {

        radius = r;
    }
    public double area()

    {
        return Math.PI *radius*radius;
    }

}
class Cylinder2 extends Circle1{
    int height;
    Cylinder2(int r, int h)
    {
        super(r);
        height=h;
    }
    public double volume()
    {

        return Math.PI *radius*radius*height;
    }

}
        public class inheritance2 {
    public static void main(String[] args) {

        Circle1 c = new Circle1(8);
        System.out.println(" Area of circle "+c.area());
        Cylinder2  MyCli = new Cylinder2(4,8);
        System.out.println(" Area of cylinder "+MyCli.volume());

    }
}
