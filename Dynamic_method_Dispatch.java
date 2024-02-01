package com.company;
class phone{
    public  void showtime()
    {
        System.out.println("4:49 PM");
    }
    public void Turn_on()
    {
        System.out.println(" Turing on phone ........");
    }

}
class smartPhone extends phone
{
    @Override
    public void Turn_on()
    {
        System.out.println(" Turing on smart phone ........");
    }
    public void playMusic()
    {
        System.out.println("Playing music.............");
    }

}
public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
       phone obj = new smartPhone();
       obj.Turn_on();
       obj.showtime();
    }
}
