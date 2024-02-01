package com.company;
class my_Generics <T1,T2>
{
    private
            T1  t1;
            T2  t2;
    my_Generics(T1 t1,T2 t2)
    {
        this .t1 = t1;
        this.t2=t2;

    }
    public T1  get_t1()
    {
        return t1;
    }
    public T2  get_t2()
    {
        return t2;
    }

}
public class Generics_java {
    public static void main(String[] args) {
        my_Generics<Integer,String> Gn =new my_Generics<>(1,"Bharti ");
        String st = Gn.get_t2();
       int int1 = Gn.get_t1();
        System.out.println(st+ int1);


    }
}
