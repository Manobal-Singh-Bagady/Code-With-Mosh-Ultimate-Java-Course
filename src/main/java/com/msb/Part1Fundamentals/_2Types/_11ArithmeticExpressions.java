package com.msb.Part1Fundamentals._2Types;

public class _11ArithmeticExpressions {
    public static void main(String[] args) {
        // operators in java
        // +, -, *, /, %
        int result = 10 + 3;
        System.out.println(result);

        // division operator will return an integer if both operands are integers.
        result = 10 / 3;
        System.out.println(result);
        float result1 = (float) 10 / 3;
        System.out.println(result1);

        // increment operator
        int x = 1;

        // postfix
        int x1 = x++;

        // prefix
        int x2 = ++x;

        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);

        // increment more than 1 by using augmented or compound assignment operators.
        x = 0;
        x = x + 2;
        x += 2;
        System.out.println(x);
    }
}
