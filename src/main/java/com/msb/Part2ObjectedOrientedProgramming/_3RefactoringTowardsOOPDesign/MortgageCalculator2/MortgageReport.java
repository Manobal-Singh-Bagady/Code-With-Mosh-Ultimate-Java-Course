package com.msb.Part2ObjectedOrientedProgramming._3RefactoringTowardsOOPDesign.MortgageCalculator2;

import java.text.NumberFormat;

class MortgageReport {

    public static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private final MortgageCalculator calculator;

    MortgageReport(int principal, double annualInterestRate, byte period) {
        this.calculator = new MortgageCalculator(principal, annualInterestRate, period);
    }

    /**
     * <strong>Print the Calculated Payment Schedule</strong>
     */
    void printPaymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances()) {
            System.out.println(currency.format(balance));
        }
    }

    /**
     * <strong>Print the Calculated Mortgage</strong>
     */
    void printMortgage() {
        // Calculate the mortgage
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);

        // Display the result
        System.out.println("\nMORTGAGE");
        System.out.println("--------");
        System.out.printf("Mortgage: %s\n", mortgageFormatted);
    }
}
