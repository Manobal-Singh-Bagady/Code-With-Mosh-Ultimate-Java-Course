package com.msb.Part1Fundamentals._3ControlFlow;

import java.util.Scanner;

public class _6TheTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        String className = income>100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}
