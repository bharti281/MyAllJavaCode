package com.company;

class MyThr extends Thread
{
    public MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        System.out.println("Thank you ");
    }

}
public class MyThr1 {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Bharti");
        MyThr t2 = new MyThr("Golu");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is "+ t1.getId());
        System.out.println("The id of the thread t is "+ t1.getName());
        System.out.println("The id of the thread t is "+ t2.getId());
        System.out.println("The id of the thread t is "+ t2.getName());
    }
}
