package com.company;

import static java.lang.StrictMath.sqrt;

class Rectangle2
{
    int height;
    int length;
    int width;

    public void setHeight(int height) {
        this.height = height;
    }
    public void setLength(int length)
    {
        this.length=length;

    }
    public void setWidth(int width)

    {
        this.width=width;
    }
    public void Area_of_rectangle()
    {

        System.out.println("Area of rectangle "+width*length);
    }
    public void Volume_of_rectangle()
    {

        System.out.println("Volume of rectangle "+length*height*width);
    }
}
class myCuboid extends Rectangle2
{

    public void Area_of_Cuboid()
    {
        System.out.println("Area of cuboid is "+sqrt(length*length+width*width+height*height));
    }
    public void Volume_of_Cuboid()

    {
        System.out.println("volume of cuboid is "+width*height*length);
    }
}

public class Class_rectangle_with_set_get {
    public static void main(String[] args) {
        Rectangle2 angle = new Rectangle2();
        angle.setHeight(5);
        angle.setLength(6);
        angle.setWidth(9);
        angle.Area_of_rectangle();
        angle.Volume_of_rectangle();
        myCuboid cube = new myCuboid();
        cube.setHeight(10);
        cube.setLength(5);
        cube.setWidth(4);
        cube.Area_of_Cuboid();
        cube.Volume_of_Cuboid();
    }
}
