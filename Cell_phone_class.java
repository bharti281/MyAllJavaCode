package com.company;

class CellPhone {
    public void ring() {
        System.out.println("ringing....");
    }

    public void Vibrate() {
        System.out.println("Vibrating....");
    }

    public void Call_friend() {
        System.out.println("call chahat:)");
    }


}

    public class Cell_phone_class {

    public static void main(String[] args) {

        CellPhone realmeX = new  CellPhone();
        realmeX.ring();
        realmeX.Vibrate();
        realmeX.Call_friend();
    }
}
