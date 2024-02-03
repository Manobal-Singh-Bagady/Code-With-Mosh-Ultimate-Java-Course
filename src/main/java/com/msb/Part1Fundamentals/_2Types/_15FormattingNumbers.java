package com.msb.Part1Fundamentals._2Types;

import java.text.NumberFormat;

public class _15FormattingNumbers {
    public static void main(String[] args) {
        // NumberFormat is an abstract class, so we can't create an instance of it
        // Currency format
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        // Percentage format
        NumberFormat percentage = NumberFormat.getPercentInstance();
        result = percentage.format(0.1);
        System.out.println(result);

        // method chaining
        result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);

    }
}
