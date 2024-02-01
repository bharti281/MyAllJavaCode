package com.company;

public class replace {
    public static void main(String[] args) {
        String latter = "Dear <|name|> Thanks a lot";
        latter = latter.replace("<|name|>","Bharti");
        System.out.println(latter);
    }
}
