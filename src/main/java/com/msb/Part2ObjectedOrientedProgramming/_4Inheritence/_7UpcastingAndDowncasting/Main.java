package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._7UpcastingAndDowncasting;

import com.msb.Part2ObjectedOrientedProgramming._4Inheritence._4ConstructorsAndInheritance.UIControl;
import com.msb.Part2ObjectedOrientedProgramming._4Inheritence._6OverridingMethods.TextBox;

public class Main {
    public static void main(String[] args) {
        var uiControl = new UIControl(true);
        var textBox = new TextBox();
        show(textBox);

    }

    public static void show(UIControl control) {
        if (control instanceof TextBox textBox) {
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
