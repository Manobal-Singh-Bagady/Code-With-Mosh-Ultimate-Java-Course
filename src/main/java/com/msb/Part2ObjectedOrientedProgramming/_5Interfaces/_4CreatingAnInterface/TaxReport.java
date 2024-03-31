package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._4CreatingAnInterface;

public class TaxReport {
    private final TaxCalculator calculator;

    public TaxReport() {
        this.calculator = new TaxCalculator2018(100_000);
    }

    public void show() {
        var tax = this.calculator.calculateTax();
        System.out.println(tax);
    }
}
