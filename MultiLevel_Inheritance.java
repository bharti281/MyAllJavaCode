package com.company;
class animal1
{
    public void eat()
    {
        System.out.println("eating....");
    }
}
class Dog extends animal1
{
    void bark()
    {
        System.out.println("barking...");
    }
}
class BabyDog1 extends Dog
{
 void weep ()
 {
     System.out.println("Weeping...");
 }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        BabyDog1 d = new BabyDog1();
        d.weep();
        d.bark();
        d.eat();

    }
}
