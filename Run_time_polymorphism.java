package com.company;
interface MyCamera2
{
    void takeSnap();
    void  recordVideo();
    default  void record4kVideo()
    {
        System.out.println("recording 4k video......");
    }

}
class mySmartphone2 implements MyCamera2
{
  public   void takeSnap()
    {
        System.out.println("taking snap......");
    }
   public void  recordVideo()
    {
        System.out.println("recording a video...........");
    }
    public void call(long number)
    {
        System.out.println("calling....... "+number);
    }
}

public class Run_time_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new mySmartphone2();
        cam.record4kVideo();
        cam.takeSnap(); // polymorphism is also called Dynamic method dispatch
        cam.record4kVideo();
       // cam.call(4646466555); <--------- do not use
    }
}
