package com.company;

public class sorted_array {
    public static void main(String[] args) {
        boolean IsSorted=true;
        int [] arr={1,5,6,8,10};
        for(int i=0 ;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                IsSorted=false;
                break;
            }
        }
        if(IsSorted)
        {
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted ");
        }
    }
}
