package com.company;
interface bicycle
{
    void applyBreak(int decrement);
    void speedUp(int increment );

}
interface belowHorn1
{
    void belowHronMy();
    void  belowHronYou();

}
class AvonCycle implements bicycle ,belowHorn1{
    int speed=7;
   public void applyBreak(int decrement)
    {
        speed = speed-decrement;
        System.out.println("Applying break");
    }
   public void speedUp(int increment )
   {
       speed = speed+increment;

       System.out.println("speed up");
   }
   public void belowHorn()
   {
       System.out.println("pe pee poo poo");
   }
    public void belowHronMy()
    {
        System.out.println("har ghri badl rhi hai roop jindgi");
    }
   public  void  belowHronYou()
   {
       System.out.println(" poo poo poo pooooo poooo ");
   }


}
public class interfaces {
    public static void main(String[] args) {
        AvonCycle bhartiCycle = new AvonCycle();
        bhartiCycle.applyBreak(1);
        bhartiCycle.speedUp(8);
        bhartiCycle.belowHorn();
        bhartiCycle.belowHronMy();
        bhartiCycle.belowHronYou();

        //bicycle B = new AvonCycle(); //<------------------ as possible
    }
}
