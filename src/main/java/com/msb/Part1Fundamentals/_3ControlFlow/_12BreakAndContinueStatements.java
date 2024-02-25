package com.msb.Part1Fundamentals._3ControlFlow;

import java.util.Scanner;

public class _12BreakAndContinueStatements {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var input = "";
        do {
            input = sc.next().toLowerCase();
            if (input.equals("pass")) continue;
            if (input.equals("quit")) break;
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
