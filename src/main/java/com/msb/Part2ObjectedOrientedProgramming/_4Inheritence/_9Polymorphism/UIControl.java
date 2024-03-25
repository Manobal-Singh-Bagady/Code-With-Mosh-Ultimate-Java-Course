package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._9Polymorphism;

public class UIControl {
    private boolean isEnabled = true;

    public void render() {

    }

    public void enable() {
        this.isEnabled = true;
    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }
}
