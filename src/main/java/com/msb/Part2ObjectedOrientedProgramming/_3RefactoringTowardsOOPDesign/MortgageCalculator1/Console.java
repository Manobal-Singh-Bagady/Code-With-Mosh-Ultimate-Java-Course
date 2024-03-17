package com.msb.Part2ObjectedOrientedProgramming._3RefactoringTowardsOOPDesign.MortgageCalculator1;

import java.util.Scanner;

class Console {
    private final Scanner sc = new Scanner(System.in);

    /**
     * <strong>Takes input from user with error handling.</strong>
     *
     * @param message message to print while taking input
     * @param min     minimum permissible input value
     * @param max     maximum permissible input value
     * @return Input from the user
     */
    double readNumber(String message, int min, int max) {
        double input;

        // take input from user until he enters the correct value
        while (true) {
            System.out.print(message);
            input = sc.nextDouble();

            if (input >= min && input <= max) break;
            System.out.printf("Enter a value from %d to %d\n", min, max);
        }
        return input;
    }

    Console() {
        System.out.println("\t\tMortgage Calculator");
        System.out.println("--------------------------------------");
    }
}
