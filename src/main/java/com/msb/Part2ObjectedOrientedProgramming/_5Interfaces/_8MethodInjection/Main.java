package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._8MethodInjection;

import com.msb.Part2ObjectedOrientedProgramming._5Interfaces._6ConstructorInjection.TaxCalculator2018;
import com.msb.Part2ObjectedOrientedProgramming._5Interfaces._7SetterInjection.TaxCalculator2019;

public class Main {
    public static void main(String[] args) {
        var report = new TaxReport();

        var calculator = new TaxCalculator2018(100_000);
        report.show(calculator);

        // method injection
        report.show(new TaxCalculator2019());
    }
}
