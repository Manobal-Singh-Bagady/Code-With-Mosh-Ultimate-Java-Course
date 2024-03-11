package com.msb.Part2ObjectedOrientedProgramming._2Classes;

public class _5MemoryAllocation {
    public static void main(String[] args) {
        var textBox1 = new _3CreatingClasses.TextBox();
        var textBox2 = textBox1;
        textBox2.setText("Hello World!");
        System.out.println(textBox1.text);
    }
}
