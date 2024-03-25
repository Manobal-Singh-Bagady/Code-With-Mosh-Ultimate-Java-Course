package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._2Inheritence;

public class TextBox extends UIControl {
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    public String text() {
        return this.text;
    }
}
