package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._6ConstructorInjection;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
        report.show();
    }
}
