package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._8ComparingObjects;

public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));
    }
}
