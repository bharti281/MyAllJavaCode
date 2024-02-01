package com.company;
abstract class  telephone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends telephone{
    public void ring()
    {

        System.out.println("uthaye naaaaaaaa uthaye naaaaaaa.......");
    }
    public void lift()
    {

        System.out.println("lift...");
    }
    public void disconnect()
    {

        System.out.println("disconnecting......");
    }
}
public class class_telephone {
    public static void main(String[] args) {
        telephone T = new SmartTelephone();
        T.disconnect();
        T.ring();
        T.lift();

    }
}
