package com.msb.Part2ObjectedOrientedProgramming._4Inheritence._10AbstractClassesAndMethods;

public abstract class UIControl {
    private boolean isEnabled = true;

    public abstract void render();

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
