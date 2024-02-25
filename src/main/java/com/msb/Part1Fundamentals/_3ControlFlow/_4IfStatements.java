package com.msb.Part1Fundamentals._3ControlFlow;

public class _4IfStatements {
    public static void main(String[] args) {
        int temp = 31;
        if (temp > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful Day");
        } else {
            System.out.println("Cold day");
        }
    }
}
