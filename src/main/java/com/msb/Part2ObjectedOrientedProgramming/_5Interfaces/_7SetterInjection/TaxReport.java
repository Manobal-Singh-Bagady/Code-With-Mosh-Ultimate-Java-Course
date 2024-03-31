package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._7SetterInjection;

import com.msb.Part2ObjectedOrientedProgramming._5Interfaces._6ConstructorInjection.TaxCalculator;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = this.calculator.calculateTax();
        System.out.println(tax);
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
