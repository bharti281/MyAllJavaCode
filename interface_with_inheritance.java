package com.company;
interface simple
{
    public void  meth1();
    public void  meth2();

}
interface child_simple extends simple
{
    public void  meth3();
    public void  meth4();

}
class my_class implements child_simple
{
    public void  meth1()
    {
        System.out.println("method 1");
    }
    public void  meth2()
    {
        System.out.println("method 2");
    }
    public void  meth3()
    {
        System.out.println("method 3");
    }
    public void  meth4()
    {
        System.out.println("method 4");
    }
}
public class interface_with_inheritance {
    public static void main(String[] args) {
     my_class Class = new my_class();
     Class.meth1();
     Class.meth2();
     Class.meth3();
     Class.meth4();

    }
}
