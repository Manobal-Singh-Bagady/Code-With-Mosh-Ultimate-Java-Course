package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._4ConstructorsAndInheritance;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("TextBox");
//        super can only be used in the first line of the constructor.
//        super(true);
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
}
