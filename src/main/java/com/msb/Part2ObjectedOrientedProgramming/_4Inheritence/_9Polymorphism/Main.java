package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._9Polymorphism;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new CheckBox(), new TextBox()};
        for (var control : controls)
            control.render();
    }
}
