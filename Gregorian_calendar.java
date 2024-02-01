package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian_calendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(Calendar.HOUR);
        System.out.println(Calendar.MINUTE);
        System.out.println(Calendar.SECOND);
        System.out.println("Railway Time "+Calendar.HOUR_OF_DAY+":"+Calendar.MINUTE+":"+Calendar.SECOND);
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2012));
        System.out.println(cal.getTimeZone());
        for(int i =0;i<629;i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
        System.out.println(cal.getWeekYear());
        System.out.println(cal.getWeeksInWeekYear());

       // System.out.println(TimeZone.getAvailableIDs()[1]);
        //System.out.println(TimeZone.getAvailableIDs()[2]);


    }
}
