package com.company;
interface Tv_remote
{
    void nextChanel();
    void beforeChanel();
    void louderSound();
    void LowSound();
}
 interface Smart_Tv_remote extends Tv_remote {
 }
 class Tv implements Tv_remote
 {
     public void nextChanel ()
     {
         System.out.println(" next Chanel ");
     }
     public void beforeChanel()

     {
         System.out.println(" before chanel");
     }
     public void louderSound()
     {

         System.out.println( " sound Louder");
     }
     public void LowSound()
     {
         System.out.println(" Low sound ");
     }
 }
public class interface_TV_remote {
    public static void main(String[] args) {

        Tv remote =  new Tv();
        remote.beforeChanel();
        remote.nextChanel();
        remote.LowSound();
        remote.louderSound();
    }
}
