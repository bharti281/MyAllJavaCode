package com.company;

public class EX_6_Exception extends Exception{
    public String toString()
    {
        return " invaild input ";
    }
    public String getMessage()
    {
        return " please Enter valid input ";
    }
}
class Can_not_div_0_exp extends Exception
{
    public String toString()
    {
        return " invaild input ";
    }
    public String getMessage()
    {
        return " please Enter valid number ";
    }
}
class  max_input extends Exception
{
    public String toString()
    {
        return " Don't support these number  ";
    }
    public String getMessage()
    {
        return " please input smaller number ";
    }

}
