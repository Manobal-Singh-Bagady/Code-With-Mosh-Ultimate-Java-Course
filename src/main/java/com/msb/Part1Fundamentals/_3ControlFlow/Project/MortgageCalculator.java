package com.msb.Part1Fundamentals._3ControlFlow.Project;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * <h1>Mortgage Calculator Project-v2</h1>
 * <p>
 * This project is a simple mortgage calculator.
 * It takes in the principal amount, annual interest rate, and period in years.
 * It then calculates the mortgage and displays it.
 * </p>
 * <br>
 * <p>
 * The formula for calculating the mortgage is:
 * <br>
 * mortgage = P * (r * (r+1)^n / ((r+1)^n - 1))
 * </p>
 * <ul>
 *     <li>P = principal</li>
 *     <li>r = monthly interest rate</li>
 *     <li>n = number of payments</li>
 * </ul>
 */
public class MortgageCalculator {
    public static void main(String[] args) {
        System.out.println("\tMortgage Calculator");
        System.out.println("--------------------------------------");

        // Get the input
        int principal = (int) takeInput("Enter the Principal amount($1K - $1M): ", 1000, 1_000_000);
        float annualInterestRate = takeInput("Enter the Annual Interest Rate: ", 1, 30);
        byte period = (byte) takeInput("Enter the Period (in Years):", 1, 30);

        // Calculate the mortgage
        String result = calculateMortgage(principal, annualInterestRate, period);

        // Display the result
        System.out.printf("Mortgage: %s\n", result);
    }

    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;
    private static final Scanner sc = new Scanner(System.in);

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
     * @param principal          Principal amount.
     * @param annualInterestRate Annual Interest Rate.
     * @param period             Period in years.
     * @return The calculated mortgage.
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
}
