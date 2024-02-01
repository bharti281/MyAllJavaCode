package com.company;

public class find_min_element_in_array {
    public static void main(String[] args) {
        int [] arr={5,6,8,25,1,68};
        int min=Integer.MAX_VALUE;
        for (int e:arr)
        {
            if(e<min)
            {
                min=e;
            }
        }
        System.out.println("The minimum value is "+min);

    }
}
