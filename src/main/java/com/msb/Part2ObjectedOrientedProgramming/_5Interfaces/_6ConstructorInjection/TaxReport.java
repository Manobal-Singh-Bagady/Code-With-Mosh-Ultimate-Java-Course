package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._6ConstructorInjection;

public class TaxReport {
    private final TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = this.calculator.calculateTax();
        System.out.println(tax);
    }
}
