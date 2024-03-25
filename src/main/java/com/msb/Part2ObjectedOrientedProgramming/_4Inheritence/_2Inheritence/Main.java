package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._2Inheritence;

public class Main {
    public static void main(String[] args) {
        var uiControl = new TextBox();
        uiControl.setText("Text");
        uiControl.enable();
        System.out.println(uiControl.isEnabled());
        System.out.println(uiControl.text());
    }
}
