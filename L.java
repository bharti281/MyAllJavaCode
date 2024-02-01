package com.company;
   public class L {
        int a, b, c;

//        L(int a ,int b,int c)
//        {
//            this.a = a;
//            this.b = b;
//            this.c = c;
//        }

public void u(int x, int y, int z) {
    a = x;
    b = y;
    c = z;
}
  }

     class Mon extends L {
//        Mon(int a, int b, int c) {
//            super(a, b, c);
//        }

        public int add() {
            int g = (a + b);
            return (g);
        }
    }

    class O extends L {
//        O(int a, int b, int c) {
//            super(a, b, c);
//        }

        public int sum() {
            int h = (a + b + c);
            return (h);
        }
    }

    class Nit {
        public static void main(String[] args) {


            //L l = new L();
           // l.u(5,5,5);
            Mon m1 = new Mon();
            m1.u(5, 5, 5);
            System.out.println(m1.add());

            O o1 = new O();
            o1.u(5,5,5);
            System.out.println(o1.sum());
        }
   }

