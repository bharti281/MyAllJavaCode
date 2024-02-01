package com.company;
import static java.lang.StrictMath.sqrt;

class rectangle1{
    int width ;
    int length;
    int height;
    rectangle1(int w ,int l, int h )
    {
        width=w;
        length=l;
        height=h;
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
class Cuboid  extends  rectangle1
{

    Cuboid(int w, int l, int h) {
        super(w, l, h);
    }

    public void Area_of_Cuboid()
    {
        System.out.println("Area of cuboid is "+sqrt(length*length+width*width+height*height));
    }
    public void Volume_of_Cuboid()

    {
        System.out.println("volume of cuboid is "+width*height*length);
    }

}
public class Class_rectangle {
    public static void main(String[] args) {
   rectangle1 rec=new rectangle1(5,9,10);
   rec.Area_of_rectangle();
   rec.Volume_of_rectangle();
   Cuboid cube = new Cuboid(10,9,3);
   cube.Area_of_Cuboid();
   cube.Volume_of_Cuboid();
    }
}
