package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time_date {
    public static void main(String[] args) {
        LocalDate D = LocalDate.now();
        System.out.println(D);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime Dt = LocalDateTime.now();
        System.out.println(Dt);
        System.out.println(Dt.getYear()+":"+Dt.getDayOfMonth()+" "+Dt.getMonth());
    }
}
