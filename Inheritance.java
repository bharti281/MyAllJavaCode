package com.company;
class Base
{
    public int x;
    public void  setX(int x)
    {
        System.out.println("This is a Base class  and set X");
        this.x=x;
    }
    public int getX() {
        return x;
    }
}
class Derived extends Base{
    public int y;

    public void setY(int y)
    {
        System.out.println("This is a Derived class  and set y");

        this.y=y;
    }
    public int getY()
    {
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Base base=new Base();
        //base.setX(5);
       // System.out.println(base.getX());
        Derived derived = new Derived();
        derived.setX(6);
        derived.setY(11);
        System.out.println(derived.getX());
        System.out.println(derived.getY());


    }
}
