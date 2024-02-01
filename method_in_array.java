package com.company;

public class method_in_array {
    static  void change(int [] arr)
    {
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int [] marks = {56,89,66,39,78};
        change(marks);
        System.out.println("The value of marks"+marks[0]);
    }
}
