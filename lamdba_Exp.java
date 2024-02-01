package com.company;
@FunctionalInterface
interface Anonymous
{
    public void meth1(int a);
   // public void meth2();
}
//class Ano implements Anonymous{
//    public void meth1()
//    {
//        System.out.println("I am method 1");
//    }
//    public void meth2()
//    {
//        System.out.println("I am method 2");
//    }
//
//}

public class lamdba_Exp {
    public static void main(String[] args) {
//        Anonymous ano = new Ano();
//        ano.meth1();
//        ano.meth2();
//        Anonymous obj = new Anonymous() {
//            @Override
//            public void meth1() {
//                System.out.println("I am method 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am method 2");
//
//            }
//
//        };
//        obj.meth1();
//        obj.meth2();
        //lambda exp
        Anonymous obj=(a)->{
            System.out.println("I am method one 1 for this lambda "+a);
        };
        obj.meth1(6);

    }
}
