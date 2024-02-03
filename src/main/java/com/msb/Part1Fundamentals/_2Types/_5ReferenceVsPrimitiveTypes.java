package com.msb.Part1Fundamentals._2Types;

import java.awt.*;

public class _5ReferenceVsPrimitiveTypes {
    public static void main(String[] args) {
        // Primitive types store values directly in memory
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        // Reference types store references to objects in memory
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

    }
}
