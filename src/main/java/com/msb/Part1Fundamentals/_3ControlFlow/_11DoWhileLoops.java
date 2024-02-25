package com.msb.Part1Fundamentals._3ControlFlow;

import java.util.Locale;
import java.util.Scanner;

public class _11DoWhileLoops {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var input = "";
        do {
            input = sc.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
