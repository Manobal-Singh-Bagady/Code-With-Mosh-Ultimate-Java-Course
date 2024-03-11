package com.msb.Part2ObjectedOrientedProgramming._2Classes;

public class _4CreatingObjects {
    public static void main(String[] args) {
        var textBox1 = new _3CreatingClasses.TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var textBox2 = new _3CreatingClasses.TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
        System.out.println(textBox1);
    }
}
