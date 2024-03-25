package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._3TheObjectClass;

import com.msb.Part2ObjectedOrientedProgramming._4Inheritence._2Inheritence.TextBox;

public class Main {
    public static void main(String[] args) {
        var box1 = new TextBox();
        var box2 = box1;

        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        box2 = new TextBox();
        System.out.println(box2.hashCode());
        System.out.println(box1.equals(box2));
        System.out.println(box1.toString());
    }
}
