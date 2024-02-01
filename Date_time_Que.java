package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Date_time_Que {
    public static void main(String[] args) {
        //-------------Qn1-------------
        Date Dt = new Date();
        System.out.println(Dt.getHours()+":"+Dt.getMinutes()+":"+Dt.getSeconds());

        //-----------Qn3---------------
        Calendar Cal = Calendar.getInstance();
        System.out.println(Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Calendar.MINUTE)+":"+Cal.get(Calendar.SECOND));

       //-----------Qn4--------------
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter DT =DateTimeFormatter.ofPattern("H:m:s");
        String myDate =dt.format(DT);
        System.out.println(myDate);

    }
}
