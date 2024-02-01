package com.company;
interface My_interface
{
    void display();
}
public class Interface_instance {
    public static void main(String[] args) {
        My_interface inter=()->{System.out.println("i am display function ");
        };
        inter.display();
        }


}


