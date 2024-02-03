package com.msb.Part1Fundamentals._2Types;

public class _14TheMathClass {
    public static void main(String[] args) {
        // Math.round(1.1F);
        int result = Math.round(1.1F);
        System.out.println(result);

        // Math.ceil(1.1F);
        result = (int) Math.ceil(1.1F);
        System.out.println(result);

        // Math.floor(1.1F);
        result = (int) Math.floor(1.1F);
        System.out.println(result);

        // Math.max(1, 2);
        result = Math.max(1, 2);
        System.out.println(result);

        // Math.min(1, 2);
        result = Math.min(1, 2);
        System.out.println(result);

        // Math.random();
        int result1 = (int) Math.round(Math.random() * 100);
        System.out.println(result1);
    }

}
