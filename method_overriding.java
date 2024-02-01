package com.company;
class A
{
    public int a;
    public int re()
    {
        return 4;
    }
    public void method1()
    {
        System.out.println("i am method 1 of class A ");
    }
}
class B extends A{
    @Override

    public void method1()
    {
     //   super.method1();
        System.out.println("i am method 2 of class B ");
    }

}
public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        B b = new B();
        b.method1();

    }
}
