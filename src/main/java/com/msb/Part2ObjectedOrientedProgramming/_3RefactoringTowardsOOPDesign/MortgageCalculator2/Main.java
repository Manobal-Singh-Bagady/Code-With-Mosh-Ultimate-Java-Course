package com.msb.Part2ObjectedOrientedProgramming._3RefactoringTowardsOOPDesign.MortgageCalculator2;

/**
 * <h1>Mortgage Calculator Project-v2</h1>
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
    public static void main(String[] args) {
        System.out.println("\t\tMortgage Calculator");
        System.out.println("--------------------------------------");

        // Get the input
        int principal = (int) Console.readNumber("Enter the Principal amount($1K - $1M): ", 1000, 1_000_000);
        double annualInterestRate = Console.readNumber("Enter the Annual Interest Rate: ", 1, 30);
        byte period = (byte) Console.readNumber("Enter the Period (in Years):", 1, 30);

        // print the calculated data
        var report = new MortgageReport(principal, annualInterestRate, period);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}
