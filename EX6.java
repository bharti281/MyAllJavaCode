package com.company;
class Invaild_input_Exception extends Exception {
    @Override
    public String toString() {
        return "Can not add";
    }
    public String getMessage()
    {
        return "Can not add 8,9";
    }
}
class Can_not_div_Zero_exp extends Exception {
    @Override
    public String toString() {
        return "you can not divide ";
    }
    public String getMessage()
    {
        return "Can not divide by 0";
    }
}
class max_input_exp extends Exception {
    @Override
    public String toString() {
        return "Input cant be greater than 1000000 ";
    }
    public String getMessage()
    {
        return "Input cant be greater than 1000000 ";
    }
}
class max_multiply_input_exp extends Exception {
    @Override
    public String toString() {
        return "max_multiply_input_exp ";
    }
    public String getMessage()
    {
        return "max_multiply_input_exp you can not multiply in these number";
    }
}
class Custom_class{
    double add(double a, double b) throws Invaild_input_Exception,max_input_exp{
        if(a>100000||b>100000)
        {
            throw new max_input_exp();
        }
        if(a==8||b==9)
        {
            throw new Invaild_input_Exception();
        }
        return a+b;
    }
    double subtraction(double a, double b) throws max_input_exp
    {
        if(a>100000||b>100000)
        {
            throw new max_input_exp();
        }
        return a-b;
    }
    double multiplication(double a, double b)throws max_input_exp,max_multiply_input_exp
    {
        if(a>100000||b>100000)
        {
            throw new max_input_exp();
        }
        else if(a>7000||b>7000) {
            throw new max_multiply_input_exp();
        }

            return a * b;

    }
    double division(double a, double b) throws Can_not_div_Zero_exp,max_input_exp
    {
        if(a>100000||b>100000)
        {
            throw new max_input_exp();
        }
        if(b==0)
        {
            throw new Can_not_div_Zero_exp();
        }
        return a/b;
    }


}
public class EX6 {
    public static void main(String[] args) throws Invaild_input_Exception,Can_not_div_Zero_exp, max_input_exp,max_multiply_input_exp
    {
        Custom_class cs =new Custom_class();
      // cs.add(5,9);
       //cs.division(5,0);
       // cs.multiplication(5,788888888);
        cs.subtraction(1000000,78);

        System.out.println( cs.subtraction(45,5));

    }
}
