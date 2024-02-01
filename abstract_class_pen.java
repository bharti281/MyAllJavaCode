package com.company;
abstract  class pen
{
    abstract void write();
    abstract void refill();

}
class fountain_pen extends pen
{
    public void write()
    {

        System.out.println("Writing");
    }
    public void refill()
    {

        System.out.println("Change refill");
    }
    public void changeNib()

    {
        System.out.println("change Nib");
    }
}
public class abstract_class_pen {
    public static void main(String[] args) {
        fountain_pen pen =new fountain_pen();
        pen.write();
        pen.refill();
        pen.changeNib();

    }
}
