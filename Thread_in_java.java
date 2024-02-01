package com.company;
class A1 extends Thread{
    int i=0;
    @Override
    public void run(){
       while (i<50)
       {
           System.out.println(" i am cooking ");
           System.out.println(" i am hangry ");
           i++;
       }
    }
}
class B1 extends Thread
{
    int i=0;
    @Override
    public void run()
    {
        while (i<50) {
            System.out.println("i am chatting with  her");
            System.out.println(" i am happy");
            i++;
        }
    }

}
public class Thread_in_java {
    public static void main(String[] args) {
        A1 T1= new A1();
        B1 T2= new B1();
        T1.start();
        T2.start();



    }
}
