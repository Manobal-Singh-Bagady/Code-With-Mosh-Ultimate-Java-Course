package com.msb.Part2ObjectedOrientedProgramming._3RefactoringTowardsOOPDesign.MortgageCalculator2;

class MortgageCalculator {
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    private final int principal;
    private final double monthlyInterest;
    private final short numberOfPayments;

    MortgageCalculator(int principal, double annualInterestRate, byte period) {
        this.principal = principal;
        monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        numberOfPayments = (short) (period * MONTHS_IN_YEAR);
    }

    /**
     * <strong>Calculates the mortgage amount.</strong>
     *
     * @return The calculated mortgage
     */
    double calculateMortgage() {
        double ratePoweredToN = Math.pow((1 + monthlyInterest), numberOfPayments);
        return principal * (monthlyInterest * ratePoweredToN / (ratePoweredToN - 1));
    }


    /**
     * <strong>Calculates the remaining amount.</strong>
     *
     * @return The calculated remaining balances.
     */
    double[] getRemainingBalances() {
        var balances = new double[numberOfPayments];
        for (short month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateRemainingPrincipal(month);
        }
        return balances;
    }

    /**
     * <strong>Calculates the Remaining Principal Amount.</strong>
     *
     * @return Remaining Principal amount after specified number of installments
     */
    double calculateRemainingPrincipal(short numberOfPaymentsMade) {
        final double poweredConstant = Math.pow(1 + monthlyInterest, numberOfPayments);
        return principal * (poweredConstant - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (poweredConstant - 1);
    }
}
