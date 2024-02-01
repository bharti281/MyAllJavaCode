package com.company;
class Deprecated_class
{
    @Deprecated
    public void meth1()
    {
        System.out.println("I am deprecated method ");
    }
}

public class Deprecate_fn_ps {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Deprecated_class D= new Deprecated_class();
                D.meth1();

    }
}
