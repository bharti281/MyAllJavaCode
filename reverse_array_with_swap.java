package com.company;

public class reverse_array_with_swap {
    public static void main(String[] args) {


    int[] arr = {2,8,6,3,7,5,9};
    int l = arr.length;
    int n = Math.floorDiv(l,2);
    int temp;
   for(int i=0;i<n ;i++){
       temp=arr[i];
       arr[i]=arr[l-i-1];
       arr[l-i-1]=temp;
   }
   for (int array:arr)
   {
       System.out.print(array+ "  ");
   }

    }

}
