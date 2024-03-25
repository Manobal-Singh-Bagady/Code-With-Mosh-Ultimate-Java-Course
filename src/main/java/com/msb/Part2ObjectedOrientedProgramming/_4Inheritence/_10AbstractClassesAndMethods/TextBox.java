package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._10AbstractClassesAndMethods;

public class TextBox extends UIControl {
    private String text = "";

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    public String text() {
        return this.text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
