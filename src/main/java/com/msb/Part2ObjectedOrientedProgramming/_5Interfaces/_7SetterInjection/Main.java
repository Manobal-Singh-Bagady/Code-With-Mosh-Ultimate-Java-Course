package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._7SetterInjection;

import com.msb.Part2ObjectedOrientedProgramming._5Interfaces._6ConstructorInjection.TaxCalculator2018;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        // constructor injection
        var report = new TaxReport(calculator);
        report.show();

        // setter injection
        report.setCalculator(new TaxCalculator2019());
        report.show();
    }
}
