package com.company;
class cell_phone
{
    public void pick_phone()
    {
        System.out.println("picking a phone.........");
    }
    public void call()
    {
        System.out.println("calling..........");
    }

}
interface GPS
{
    public void Turn_on_GPS();
}
interface media_player
{
    public void play_song();
    public void  pause_song();
    private void greet()  //<----- can be overriding
    {
        System.out.println(" ***** Welcome ***** ");
    }
    default public void play_next_song()//<------ this can be overriding
    {
        greet();
        System.out.println("qki itna payr tumse krte hai hum...... ");
    }
}
interface  Camera
{
    public  void  click_picture();
    public void show_picture();
}
class Smart_phone extends cell_phone implements GPS,media_player,Camera
{
    public void Turn_on_GPS()
    {
        System.out.println("open your location ");
    }
  //  private void greet()
    //{
      //  System.out.println(" ");
    //}

    public void play_song()
    {
        System.out.println("dil tu hi bta..........");
    }
    public void  pause_song()
    {
        System.out.println("pause songs.....");
    }
    public  void  click_picture()
    {
        System.out.println("taking a picture........");
    }
    public void show_picture()
    {
        System.out.println("showing a picture.....");
    }

}
public class interface_Class {
    public static void main(String[] args) {
    Smart_phone phone = new Smart_phone();
        phone.play_song();
        phone.pause_song();
        phone.play_next_song();
        phone.click_picture();
    phone.show_picture();;
    phone.call();
    phone.pick_phone();
    phone.Turn_on_GPS();

    }
}
