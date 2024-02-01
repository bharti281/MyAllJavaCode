package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Write_multiplication_table_in_file {
    public static void main(String[] args) {
        int i =2;
        String table ="";
        for(int j=0; j<10; j++)
        {
         table += i+" X "+(j+1)+" = "+i*(j+1);
         table+="\n";
        }
        try{
            FileWriter fileWriter =  new FileWriter("multiplication_table.txt");
            fileWriter.write(table);
            fileWriter.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
