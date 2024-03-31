package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._9InterfaceSegregationPrinciple;

public class Dragger {
    public void drag(UIWidget widget) {
        widget.drag();
        System.out.println("Dragging done!");
    }
}

