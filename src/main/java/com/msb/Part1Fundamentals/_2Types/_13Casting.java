package com.msb.Part1Fundamentals._2Types;

public class _13Casting {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double a = 1.1;
        double b = a + 2;
        System.out.println(b);

        // Explicit casting
        double c = 1.1;
        int d = (int) c + 2;
        System.out.println(d);

        // Explicit casting can only be done between compatible types.
        String e = "1";
        int f = Short.parseShort(e) + 2;
        System.out.println(f);
    }
}
