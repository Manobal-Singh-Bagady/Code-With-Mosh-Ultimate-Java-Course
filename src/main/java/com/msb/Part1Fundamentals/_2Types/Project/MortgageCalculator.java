package com.msb.Part1Fundamentals._2Types.Project;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * <h1>Mortgage Calculator Project.</h1>
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
        System.out.println("---------------------------");

        // Get the input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        long P = scanner.nextLong();
        System.out.print("Enter the Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("Enter the Period(in Years): ");
        short N = scanner.nextShort();

        // Calculate the mortgage
        String result = CalculateMortgage(P, annualInterestRate, N);

        // Display the result
        System.out.printf("Mortgage: %s\n", result);
    }

    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    /**
     * <strong>Calculates the mortgage amount.</strong>
     *
     * @param P                  Principal amount.
     * @param annualInterestRate Annual Interest Rate.
     * @param N                  Period in years.
     * @return The calculated mortgage.
     */
    private static String CalculateMortgage(long P, float annualInterestRate, short N) {
        // Conversion for calculations.
        int n = N * MONTHS_IN_YEAR;
        double r = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        double ratePowered = Math.pow((1 + r), n);

        // P = principal
        // r = monthly interest rate
        // n = number of payments
        // ratePowered = (1 + r) ^ n

        // formula for calculating mortgage
        //  = P * (r * ratePowered / (ratePowered - 1))

        // calculate the mortgage
        double mortgage = P * (r * ratePowered / (ratePowered - 1));

        // format the mortgage to currency format and return.
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }
}
