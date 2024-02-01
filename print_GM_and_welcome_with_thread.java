package com.company;
class Good_morning extends Thread
{
    @Override
    public void run() {

        while (true)
        {
            System.out.println(" Good morning ..............." +getState());

        }
    }
}
class Welcome extends Thread
{
    public void run()
    {

        while(true)
        {


                System.out.println(" Welcome.... " + getState());
            try {
                Thread.sleep(200);
            }

            catch (Exception e)
            {
                System.out.println("system error");
            }
        }
    }
}
public class print_GM_and_welcome_with_thread {
    public static void main(String[] args) {
        Good_morning Gm = new Good_morning();
       // Gm.start();
        Gm.setPriority(6);
        System.out.println(Gm.getPriority());
        System.out.println( Gm .getState());
        Welcome Wc = new Welcome();
      //  Wc.start();
        Wc.setPriority(9);
        System.out.println(Wc.getPriority());
        System.out.println(Wc.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
