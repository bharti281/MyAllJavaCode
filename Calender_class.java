package com.company;

import java.util.Calendar;

public class Calender_class {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
        System.out.println(Calendar.getAvailableCalendarTypes());
        System.out.println(Calendar.ALL_STYLES);
        System.out.println(c.getTimeZone());
//    Calendar c =Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
// System.out.println(c.getTimeZone().getID());
        System.out.println(Character.getType(5));
        System.out.println(Character.isAlphabetic(45));


    }
}
