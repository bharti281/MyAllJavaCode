package com.company;
@FunctionalInterface
interface one_fn
{
    void this_method();
   // void this2_method();
}

class new_phone extends phone
{
    @Override
    public void showtime()
    {
        System.out.println("Time is 8pm");
    }
    @Deprecated
    public int sum(int a, int b)
        {
        return a+b;
    }
}

public class Annotations_in_java
{
    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
        new_phone ph = new new_phone();
        ph.showtime();
        ph.sum(5,6);

    }
}
