package com.company;
class My_cylinder {
    private int radius;
    private int height;

    public My_cylinder(int radius, int height) {
        this.radius = radius;
       this. height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}
public class use_constructor_q9 {
    public static void main(String[] args) {

        My_cylinder cil = new My_cylinder(9,12);
        System.out.println(cil.getHeight());
        System.out.println(cil.getRadius());
    }
}
