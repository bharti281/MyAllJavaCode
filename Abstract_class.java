package com.company;
abstract class parent {
    public parent()
    {

        System.out.println(" mai constructors hoo");
    }
    public void sayHello()
    {
        System.out.println("HELLO");
    }
    abstract public void greet();
    abstract public void greet1();

}
class child extends parent
{
    @Override
     public void greet()
    {
        System.out.println("Good morning");
    }
    public void greet1()
    {
        System.out.println("Good after non");
    }

}
abstract class child1 extends parent
{
    abstract public void greet2();

}
class child2 extends child1
{
    public void greet2()

    {
        System.out.println("Good morning");
    }

    @Override
    public void greet() {
        System.out.println("Good night");

    }

    @Override
    public void greet1() {
        System.out.println("Good after non");

    }
}
public class Abstract_class {
    public static void main(String[] args) {
        child ch = new child();
        ch.greet();
        ch.sayHello();
        child2 ch2 = new child2();
        ch2.greet();
        ch2.sayHello();
        ch2.greet1();
        ch2.greet2();

      //  parent p = new child();  <------ as possible

    }
}
