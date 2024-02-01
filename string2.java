package com.company;

public class string2 {
    public static void main(String[] args) {
        String name  = "Bharti";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String a = "   Bharti_kumari";
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace("r","p"));
        System.out.println(name.replace("Bha", "Ras"));
        System.out.println(name.startsWith("Bh"));
        System.out.println(name.startsWith("df"));
        System.out.println(name.endsWith("ti"));
        System.out.println(name.endsWith("er"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("t",0));
        System.out.println(name.lastIndexOf("rti",3));
        System.out.println(name.equals("Bharti"));
        System.out.println(name.equals("nehu"));
        System.out.println(name.equalsIgnoreCase("BHartI"));

    }
}
