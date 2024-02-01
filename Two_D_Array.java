package com.company;

public class Two_D_Array {
    public static void main(String[] args) {
        int [][]arr=new int [2][3];
        arr[0][0]=520;
        arr[0][1]=521;
        arr[0][2]=522;
        arr[1][0]=523;
        arr[1][1]=524;
        arr[1][2]=525;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }

            System.out.println("");
        }



    }
}
