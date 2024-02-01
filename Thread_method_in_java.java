package com.company;
class thread1 extends Thread
{
    @Override

    public void run() {
        int i =0 ;
        while (i<50) {
            System.out.println(" Hy i am thread 1");
            i++;
            try {
                Thread.sleep(200);
            }
            catch (Exception e)
            {
                System.out.println(" System Error");
            }
        }
    }
}
class thread2 extends Thread
{

    public void run()
    {
        int i =0 ;
        while (i < 50)
        {
            System.out.println(" Hy i am thread 2");
            i++;
        }
    }

}
public class Thread_method_in_java {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();

        //try {
          //  t1.join();
        //} catch (Exception e) {
            System.out.println(" Show error ");
      //  }
        t2.start();

    }
}
