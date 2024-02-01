package com.company;
class Tommy{
    public void hit()
    {
        System.out.println("Hitting the enemy");
    }
    public void Run()
    {

        System.out.println("Running from the enemy");
    }
    public void fire()
    {
        System.out.println("firing on the enemy");
    }
}

public class Tommy_Vecetti {
    public static void main(String[] args) {
        Tommy tom = new Tommy();
        tom.Run();
        tom.hit();;
        tom.fire();
    }
}
