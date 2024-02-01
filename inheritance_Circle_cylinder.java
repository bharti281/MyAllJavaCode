package com.company;
class myCircle
{
    int radius;
    public void setRadius(int radius) {

        this.radius = radius;
    }
    public double area()

    {
        return Math.PI *radius*radius;

    }
}
class  MyCylinder extends myCircle
{
    int height;

    public void setHeight(int h)
    {
        height=h;
    }
    public double volume()
    {

        return Math.PI *radius*radius*height;
    }
}
public class inheritance_Circle_cylinder {
    public static void main(String[] args) {
        myCircle C = new myCircle();
        C.setRadius(5);
        System.out.println("The area of Circle is:"+C.area());
        MyCylinder M = new MyCylinder();
        M.setHeight(10);
        M.setRadius(16);
        System.out.println("The volume of Cylinder: "+M.volume());

    }
}
