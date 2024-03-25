package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._6OverridingMethods;

import com.msb.Part2ObjectedOrientedProgramming._4Inheritence._4ConstructorsAndInheritance.UIControl;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(true);
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

    @Override
    public String toString() {
        return this.text;
    }
}
