package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._3TightlyCoupledCode;

public class TaxCalculator {
    private final double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
