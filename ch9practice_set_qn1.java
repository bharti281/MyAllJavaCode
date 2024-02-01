package com.company;

class cylinder{
  private int radius;
  private  int Height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
    public double surface_area(){
        return 2*Math.PI*radius*Height+2*Math.PI*radius*Height;
    }
    public double Volume(){
        return Math.PI*radius*radius*Height;
    }
}
public class ch9practice_set_qn1 {
    public static void main(String[] args) {
        cylinder cil = new cylinder();
        cil.setHeight(12);
        System.out.println(cil.getHeight());
        cil.setRadius(9);
        System.out.println(cil.getRadius());
        System.out.println("The surface of area is "+ cil.surface_area());
        System.out.println("The volume of area is "+ cil.Volume());




    }
}
