package com.msb.Part2ObjectedOrientedProgramming._3RefactoringTowardsOOPDesign.MortgageCalculator1;

import org.jetbrains.annotations.NotNull;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.StringTemplate.STR;

class PaymentSchedule {
    private final ArrayList<Double> paymentSchedule;

    /**
     * <strong>Print the Calculated Payment Schedule</strong>
     */
    void printPaymentSchedule() {
        System.out.println("\n\n\tPAYMENT SCHEDULE");
        System.out.println("-----------------------------");

        AtomicInteger m = new AtomicInteger(1);
        paymentSchedule.forEach((payment) -> {
            String remainingAmount = NumberFormat.getCurrencyInstance().format(payment);
            System.out.println(STR."After \{m.getAndIncrement()} Months: \{remainingAmount}");
        });
    }

    PaymentSchedule(@NotNull Mortgage mortgage) {
        int principal = mortgage.getPrincipal();
        byte period = mortgage.getPeriod();
        double annualInterestRate = mortgage.getAnnualInterestRate();

        // calculate required fields
        short numberOfPayments = (short) (period * Main.MONTHS_IN_YEAR);
        double monthlyInterest = annualInterestRate / Main.PERCENT / Main.MONTHS_IN_YEAR;
        double powerConstant = Math.pow(1 + monthlyInterest, numberOfPayments);

        // calculate payment schedule
        paymentSchedule = new ArrayList<>();
        for (short m = 1; m <= numberOfPayments; m++) {
            double remainingAmount =
                    principal * (powerConstant - Math.pow(1 + monthlyInterest, m)) / (powerConstant - 1);
            paymentSchedule.add(remainingAmount);
        }
    }
}
