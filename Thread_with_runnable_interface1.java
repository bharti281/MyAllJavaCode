package com.company;
class thread_with_interface1 implements Runnable
{
    int i=0;
    public void run()
    {
        while(i<100)
        {
            System.out.println(" Hy i am Thread with runnable interface 111");
            i++;
        }
    }
}
class thread_with_interface2 implements Runnable
{
    int i=0;
    public void run()
    {
        while(i<100)
        {
            System.out.println(" Hy i am Thread with runnable interface 222");
            i++;
        }
    }
}
public class Thread_with_runnable_interface1 {
    public static void main(String[] args) {
        thread_with_interface1 t1 = new thread_with_interface1();
        Thread th1= new Thread(t1);
        thread_with_interface2 t2 = new thread_with_interface2();
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();



    }
}
