package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._8MethodInjection;

import com.msb.Part2ObjectedOrientedProgramming._5Interfaces._6ConstructorInjection.TaxCalculator;

public class TaxReport {
//    private TaxCalculator calculator;

//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
