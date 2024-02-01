package com.company;
class priorities extends Thread
{
    priorities(String name)
    {
        super(name);
    }
    int i=0;
    @Override
    public void run() {
        while (i<50)
        {
            System.out.println(" i am thread"+getName());
            i++;
        }
    }
}
public class Thread_priorities {
    public static void main(String[] args) {
        priorities P1 = new priorities("Bharti1");
        P1.start();
        priorities P2 = new priorities("bharti2");
        P2.start();
        priorities P3 = new priorities("Bharti3");
        P3.start();
        priorities P4 = new priorities("Bharti4");
        P4.start();
        priorities P5 = new priorities("Bharti5(Most impotent)");
        P5 .setPriority(Thread.MAX_PRIORITY);

        P5.start();





    }
}
