package com.company;
import java.util.Scanner;
class myRectangle {
    int length;
    int Width;
    int height;
    Scanner sc =new Scanner(System.in);
    public void set_length()
    {
        System.out.println("Enter the value of length ");
         length = sc.nextInt();
    }
    public void set_Width()
    {
        System.out.println("Enter the value of Width");
        Width =sc.nextInt();
    }
    public void setHeight()
    {
        System.out.println("Enter the value of Height");
        height = sc.nextInt();
    }
    public void area() {
        System.out.println("Area of rectangle " + length * Width);
    }
    public void perimeter()
    {

        System.out.println("The perimeter of rectangle "+ 2*(length+Width));
    }
    public void Volume_of_rectangle()
    {

        System.out.println("Volume of rectangle "+length*height*Width);
    }

}
class mySquare
{
    Scanner sc =new Scanner(System.in);
    int side;
           public void setSide()
            {
                System.out.println("Enter Square side");
                side= sc.nextInt();
            }
    public void Sq_area()
    {
        System.out.println( "area of Square "+side*side);
    }
    public void Sq_perimeter()
    {

        System.out.println("perimeter of square"+ side*4);
    }
    public void Diagonal()
    {
        System.out.println("Diagonal of square"+ Math.sqrt(2*side));
    }
}
class myCircle1 extends myRectangle
{
    int radius;
     public void  set_radius()
    {
        System.out.println("Enter radius  ");
        radius = sc.nextInt();
    }
    public void cir_area()
    {
        System.out.println("The area of circle "+ Math.PI *radius*radius);

    }
    public void diameter()
    {
        System.out.println("The diameter of circle " + 2*radius );
    }
    public void Circumference()
    {

        System.out.println("The Circumference of circle  "+ 2*Math.PI*radius);
    }

}
class Cylinder extends myCircle1
{
    public void volume()
    {

        System.out.println("value of Cylinder "+Math.PI *radius*radius*height);
    }
    public void Surface_area()
    {
        System.out.println("Surface area of Cylinder "+ 2* Math.PI*radius*height+2*Math.PI*radius*radius);
    }
    public void lateral_Surface()
    {
        System.out.println("The literal Surface of Cylinder "+ 2*Math.PI*radius*height);
    }

}
class My_sphere1 extends myCircle1
{
    public void surface_area()

    {
        System.out.println("Surface area of sphere "+4*Math.PI*radius*radius);
    }

    public void  Volume(){

        System.out.println("The volume of sphere  "+(float)4/3*Math.PI*radius*radius*radius);
    }
    public void Diameter ()

    {
        System.out.println("The Diameter of Sphere "+ 2*radius);
    }
}

public class find_all_area {
    public static void main(String[] args) {
        My_sphere1 sp = new My_sphere1();
        sp.set_length();
        sp.set_Width();
        sp.setHeight();
        sp.area();
        sp.perimeter();
        sp.Volume_of_rectangle();
        sp.set_radius();
        sp.cir_area();
        sp.diameter();
        sp.Circumference();
        sp.surface_area();
        sp.Volume();
        sp.Diameter();

        Cylinder Cy =new Cylinder();
        Cy.set_radius();
        Cy.setHeight();
        Cy.volume();
        Cy.Surface_area();
        Cy.lateral_Surface();

        mySquare Sq = new mySquare();
        Sq.setSide();
        Sq.Sq_area();
        Sq.Sq_perimeter();
        Sq.Diagonal();

    }
}
