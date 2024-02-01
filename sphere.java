package com.company;
class MySphere{
    private int radius;
    public void setRadius(int radius) {

        this.radius = radius;
    }
    public double surface_area()


    {
     return 4*Math.PI*radius*radius;
    }

    public double Volume(){

        return (float)4/3*Math.PI*radius*radius*radius;
    }

    }

public class sphere {
    public static void main(String[] args) {
        MySphere sp = new MySphere();
        sp.setRadius(5);
        System.out.println(sp.surface_area());
        System.out.println(sp.Volume());
    }
}
