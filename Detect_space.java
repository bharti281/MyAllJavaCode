package com.company;

public class Detect_space {
    public static void main(String[] args) {
        String text = "This is a space  detect   program";
        System.out.println( text.indexOf("  "));
        System.out.println( text.indexOf("   "));

    }
}
