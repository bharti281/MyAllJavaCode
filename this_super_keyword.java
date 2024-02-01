package com.company;
class Ekclass
{
   int a;
   Ekclass(int a)
   {
       this.a = a;
   }
    public void getA()
    {
        System.out.println("The value of a is "+a);
    }

}
class Doclass extends Ekclass
{
    int b;
    Doclass (int a,int b )
    {
        super(a);
        this.b=b;
    }
    public void getB()
    {
        System.out.println("The value of b is "+b);
    }
}

public class this_super_keyword {
    public static void main(String[] args) {
        //Ekclass Class_ek = new Ekclass;
      //  Class_ek.getA();
        Doclass Class = new Doclass(5,6);
        Class.getA();
        Class.getB();
    }
}
