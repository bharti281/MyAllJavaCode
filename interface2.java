package com.company;
interface phone1
{
  public void ring ();
  public void vibrate();

}
interface phoneModelXYZ
{
    public void ClickPic();
    public void playMusic();
}
class realme implements phone1 , phoneModelXYZ
{

    public void ring ()
    {
        System.out.println(" ringing ..........");
    }
    public void vibrate()
    {
        System.out.println("vibrate.............");
    }
    public void ClickPic()
    {
        System.out.println("Click picture.......");
    }
    public void playMusic()
    {
        System.out.println(" Tum mile to lamhe khil gye.......");

    }


}
public class interface2 {
    public static void main(String[] args) {
        realme re = new realme();
        re.ClickPic();
        re.playMusic();
        re.ring();
        re.vibrate();
        //phone1 ph = new realme();   <--------- as possible

    }
}
