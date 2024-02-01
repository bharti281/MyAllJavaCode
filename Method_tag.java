package com.company;

public class Method_tag {
    /**
     * this is the good class
     * @param args these argument supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method ");
    }

    /**
     * Hello this is a method and this  is the most better beautiful method of this class
     * @param a this is the  first number to add
     * @param b this is the second number to add
     * @return sum of two number as an integer
     * @throws Exception if a is 0;
     * @deprecated  this method to deprecated please use + operator
     */
    public int add(int a ,int b) throws Exception {
        if(a==0)
        {
            throw new  Exception();
        }
        int c;
        c=a+b;
        return c;
    }
}
