package com.company;
class Base1
{
  Base1()
  {
      System.out.println("i am Base1 class construct ");
  }
    Base1(int x)
    {
        System.out.println("i am Base1 class construct with value of  X as "+x);
    }

}
class Derived1 extends Base1{
      Derived1()
    {
       // super(5);
        System.out.println("i am Derived1 class construct ");

    }

    Derived1(int x,int y)
    {
       super(x);
        System.out.println("i am Derived1 class construct with value of  y as "+y);
    }
}
class Derived2 extends Derived1{
    Derived2()
    {
        // super(5);
        System.out.println("i am Derived2 class construct ");

    }

    Derived2(int x,int y , int z)
    {
        super(x,y);
        System.out.println("i am Derived2 class construct with value of  y as "+z);
    }
}
public class Constructors_in_inheritance {
    public static void main(String[] args) {
   // Base1 B= new Base1 ();
       // Derived1 D = new Derived1();
        Derived2 D = new Derived2(5,6,9);

    }
}
