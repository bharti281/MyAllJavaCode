package com.company;
class animal{
  public  int leg;
    public int eye;
    public void setLeg(int leg)
    {
        this.leg = leg;
    }
    public void getLeg()
    {
        System.out.println("Animal leg is "+leg);
    }
    public void setEye(int Eye)
    {
        eye=Eye;
    }

    public void getEye() {
        System.out.println("Animal Eye is "+eye);
    }
}
class dog extends animal
{
    public String name ;

    public String sound;

    public void setName(String name)
    {
        this .name=name;

    }
    public void getName()
    {
        System.out.println("The name of Animal is "+name);
    }
    public void setSound(String sound)
    {
        this.sound = sound;
    }
    public void getSound()
    {
        System.out.println("Animal sound is "+sound);
    }
}

public class Inheriantace1 {
    public static void main(String[] args) {
        dog  Tomy = new dog();
        Tomy.setName("Tommy");
        Tomy.getName();
        Tomy.setLeg(4);
        Tomy.getLeg();
        Tomy.setEye(2);
        Tomy.getEye();
        Tomy.setSound("Bhuuu :)");
        Tomy.getSound();

    }
}
