package com.company;

public class three_D_array {
    public static void main(String[] args) {
        int[][][] arr = new int[2][3][4];
        arr[0][0][0] = 520;
        arr[0][0][1] = 521;
        arr[0][0][2] = 522;

        arr[0][1][0] = 523;
        arr[0][1][1] = 524;
        arr[0][1][2] = 525;

        arr[0][2][0] = 526;
        arr[0][2][1] = 527;
        arr[0][2][2] = 528;


        arr[1][0][0] = 529;
        arr[1][0][1] = 530;
        arr[1][0][2] = 531;

        arr[1][1][0] = 532;
        arr[1][1][1] = 533;
        arr[1][1][2] = 534;

        arr[1][2][0] = 535;
        arr[1][2][1] = 536;
        arr[1][2][2] = 537;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for(int k=0;k<arr[j].length;k++){
                    System.out.print(" ");
                    System.out.print(arr[i][j][k]);
                   System.out.print(" ");

                }
                System.out.println("");

            }


        }
    }
}