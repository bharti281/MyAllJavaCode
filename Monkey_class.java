package com.company;
class monkey
{
    public void jump()
    {
        System.out.println("Jumping....");
    }
    public void bite()
    {
        System.out.println("bite...");
    }
}
interface basicAnimal
{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal
{

    public void eat()
    {
        System.out.println("eating....");
    }
    public void sleep()
    {
        System.out.println("sleeping....");
    }
}
public class Monkey_class {
    public static void main(String[] args) {
        human H = new human();
        H.sleep();
        H.eat();
        monkey M =new human();
       // M.eat <-------------- polymorphism
        M.jump();
        M.bite();

    }
}
