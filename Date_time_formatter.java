package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime dt =LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df =DateTimeFormatter.ofPattern("dd/MM/yyyy-- E H: a");
       // DateTimeFormatter df2 =DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate = df.format(dt);
        System.out.println(mydate);


    }
}

