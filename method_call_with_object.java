package com.company;
public class method_call_with_object {
    int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
        method_call_with_object obj = new method_call_with_object();
        System.out.println( obj.sum(a,b));
        //obj.sum(a,b);
    }
}
