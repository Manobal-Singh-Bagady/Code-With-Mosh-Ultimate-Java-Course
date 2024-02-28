package com.msb.Part1Fundamentals._4CleanCoding.Project.Project;

import java.text.NumberFormat;
import java.util.Scanner;

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
public class MortgageCalculator {
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\t\tMortgage Calculator");
        System.out.println("--------------------------------------");

        // Get the input
        int principal = (int) takeInput("Enter the Principal amount($1K - $1M): ", 1000, 1_000_000);
        float annualInterestRate = takeInput("Enter the Annual Interest Rate: ", 1, 30);
        byte period = (byte) takeInput("Enter the Period (in Years):", 1, 30);

        // print the calculated data
        printMortgage(principal, annualInterestRate, period);
        printPaymentSchedule(period, principal, annualInterestRate);
    }

    /**
     * <strong>Print the Calculated Payment Schedule</strong>
     *
     * @param principal          Principal amount
     * @param annualInterestRate Annual Interest Rate
     * @param period             Time Period in Years
     */
    private static void printPaymentSchedule(byte period, int principal, float annualInterestRate) {
        // Display the payment Schedule
        System.out.println("\n\n\tPAYMENT SCHEDULE");
        System.out.println("-----------------------------");
        for (short month = 1; month <= period * MONTHS_IN_YEAR; month++) {
            String remainingAmount = calculateRemainingPrincipal(principal, annualInterestRate, period, month);
            System.out.printf("After %d Month%s: %s\n", month, (month == 1 ? "" : "s"), remainingAmount);
        }
    }

    /**
     * <strong>Print the Calculated Mortgage</strong>
     *
     * @param principal          Principal amount
     * @param annualInterestRate Annual Interest Rate
     * @param period             Time Period in Years
     */
    private static void printMortgage(int principal, float annualInterestRate, byte period) {
        // Calculate the mortgage
        String mortgage = calculateMortgage(principal, annualInterestRate, period);

        // Display the result
        System.out.println("\n\t\tMORTGAGE");
        System.out.println("----------------------------");
        System.out.printf("Mortgage: %s\n", mortgage);
    }

    /**
     * <strong>Takes input from user with error handling.</strong>
     *
     * @param message message to print while taking input
     * @param min     minimum permissible input value
     * @param max     maximum permissible input value
     * @return Input from the user
     */
    private static float takeInput(String message, int min, int max) {
        float input;

        // take input from user until he enters the correct value
        while (true) {
            System.out.print(message);
            input = sc.nextFloat();

            if (input >= min && input <= max) break;
            System.out.printf("Enter a value from %d to %d\n", min, max);
        }
        return input;
    }

    /**
     * <strong>Calculates the mortgage amount.</strong>
     *
     * @param principal          Loan principal amount
     * @param annualInterestRate Annual Interest Rate
     * @param period             Period of loan in years
     * @return The calculated mortgage
     */
    private static String calculateMortgage(int principal, float annualInterestRate, byte period) {
        // Conversion for calculations.
        float rateOfInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (period * MONTHS_IN_YEAR);
        double ratePoweredToN = Math.pow((1 + rateOfInterest), numberOfPayments);

        // calculate the mortgage
        double mortgage = principal * (rateOfInterest * ratePoweredToN / (ratePoweredToN - 1));

        // format the mortgage to the currency format and return.
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }

    /**
     * <strong>Calculates the Remaining Principal Amount.</strong>
     *
     * @param principal            Loan principal amount
     * @param annualInterestRate   Annual Interest rate
     * @param period               Period of loan in years
     * @param numberOfPaymentsMade No. of Installments paid
     * @return Remaining Principal amount after specified number of installments
     */
    private static String calculateRemainingPrincipal(int principal, float annualInterestRate, byte period, short numberOfPaymentsMade) {

        // calculate required variables
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (period * MONTHS_IN_YEAR);

        // calculate remaining amount
        double remainingAmount = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // format the remaining amount to currency format and return
        return NumberFormat.getCurrencyInstance().format(remainingAmount);
    }
}
