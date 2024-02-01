package com.company;

public class area_of_rectagel {
    float rec(float l, float b)
    {
        return l*b;
    }
    public static void main(String[] args) {
        float l=6.2f;
        float b=5.6f;
        area_of_rectagel obj=new area_of_rectagel();
        System.out.println(obj.rec(l,b));
    }
}
