package com.msb.Part1Fundamentals._2Types;

import java.util.Scanner;

public class _16ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        byte age = scanner.nextByte();
        System.out.printf("You are %d years old.\n", age);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner1.nextLine().trim();
        System.out.printf("Hello %s\n", name);
    }
}
