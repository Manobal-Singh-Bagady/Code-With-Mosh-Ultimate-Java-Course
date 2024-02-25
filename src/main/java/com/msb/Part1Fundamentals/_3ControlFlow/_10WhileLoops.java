package com.msb.Part1Fundamentals._3ControlFlow;

import java.util.Locale;
import java.util.Scanner;

public class _10WhileLoops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello World! " + i);
            i++;
        }

        // String while loop
        var sc = new Scanner(System.in);
        var input = "";
        while (!input.equals("quit")) {
            input = sc.next().toLowerCase();
            System.out.println(input);
        }
    }
}
