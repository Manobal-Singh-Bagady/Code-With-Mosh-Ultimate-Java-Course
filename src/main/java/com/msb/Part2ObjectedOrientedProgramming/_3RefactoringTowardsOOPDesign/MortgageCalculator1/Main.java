package com.msb.Part2ObjectedOrientedProgramming._3RefactoringTowardsOOPDesign.MortgageCalculator1;

/**
 * <h1>Mortgage Calculator Project-v3</h1>
 *
 * <p>This project is a simple mortgage calculator. It takes in the principal amount, annual
 * interest rate, and period in years. It then calculates the mortgage and displays it. <br>
 *
 * <p>The formula for calculating the mortgage is: <br>
 * mortgage = P * (r * (r+1)^n / ((r+1)^n - 1))
 *
 * <ul>
 *   <li>P = principal
 *   <li>r = monthly interest rate
 *   <li>n = number of payments
 * </ul>
 */
public class Main {
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;

    public static void main(String[] args) {
        // Get the input
        var console = new Console();
        int principal = (int) console.readNumber("Enter the Principal amount(₹1K - ₹10L): ", 1000, 10_00_000);
        double annualInterestRate = console.readNumber("Enter the Annual Interest Rate: ", 1, 30);
        byte period = (byte) console.readNumber("Enter the Period (in Years):", 1, 30);

        // mortgage
        var mortgage = new Mortgage(principal, annualInterestRate, period);
        mortgage.printMortgage();

        // payment schedule
        var paymentSchedule = new PaymentSchedule(mortgage);
        paymentSchedule.printPaymentSchedule();
    }
}