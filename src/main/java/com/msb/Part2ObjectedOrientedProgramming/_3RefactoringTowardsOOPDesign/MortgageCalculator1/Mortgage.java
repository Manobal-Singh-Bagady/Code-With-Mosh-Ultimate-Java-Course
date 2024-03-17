package com.msb.Part2ObjectedOrientedProgramming._3RefactoringTowardsOOPDesign.MortgageCalculator1;

import java.text.NumberFormat;

class Mortgage {
    private final int principal;
    private final double annualInterestRate;
    private final byte period;
    private final double mortgage;

    /**
     * <strong>Print the Calculated Mortgage</strong>
     */
    void printMortgage() {
        System.out.println("\n\t\tMORTGAGE");
        System.out.println("----------------------------");
        System.out.printf("Mortgage: %s\n", this.getFormattedMortgage());
    }

    Mortgage(int principal, double annualInterestRate, byte period) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.period = period;

        // Calculate mortgage
        double rateOfInterest = this.annualInterestRate / Main.PERCENT / Main.MONTHS_IN_YEAR;
        short numberOfPayments = (short) (this.period * Main.MONTHS_IN_YEAR);
        double ratePoweredToN = Math.pow((1 + rateOfInterest), numberOfPayments);
        mortgage = this.principal * (rateOfInterest * ratePoweredToN / (ratePoweredToN - 1));
    }

    private String getFormattedMortgage() {
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }

    int getPrincipal() {
        return principal;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    byte getPeriod() {
        return period;
    }

}
