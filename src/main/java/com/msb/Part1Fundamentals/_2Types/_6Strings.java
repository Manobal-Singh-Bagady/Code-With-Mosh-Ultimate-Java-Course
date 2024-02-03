package com.msb.Part1Fundamentals._2Types;

public class _6Strings {
    public static void main(String[] args) {
        // Redundant method of declaring a string.
        String message = new String("Hello World!");

        // new method of declaring a string.
        String message1 = "Hello World!";

        System.out.println(message1);

        // concatenation
        message1 += "!";
        System.out.println(message1);

        // methods
        System.out.println(message1.endsWith("!!"));
        System.out.println(message1.startsWith("!!"));
        System.out.println(message1.length());
        System.out.println(message1.indexOf("H"));
        System.out.println(message1.indexOf("e"));
        System.out.println(message1.indexOf("llo"));
        System.out.println(message1.indexOf(("sky")));

        // doesn't modify the original string because strings are immutable in java.
        System.out.println(message1.replace("!", "*"));
        System.out.println(message1);

        System.out.println(message1.toLowerCase());
        System.out.println(message1.toUpperCase());
        System.out.println(message1.trim());


    }
}
