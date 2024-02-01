package com.company;
class Animal
{
    public void eat()
    {
        System.out.println("eating....");
    }

}
class dog1 extends Animal
{
    void bark()
    {
        System.out.println("barking...");
    }
}
class Cat extends Animal
{
    void weep ()
    {
        System.out.println("Meowing...");
    }
}
public class Hierarchical_inheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.weep();
        dog1 d= new dog1();
        d.bark();
        d.eat();
    }
}
