package com.msb.Part1Fundamentals._3ControlFlow.Exercise;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create Scanner
        var sc = new Scanner(System.in);

        // take input of number
        int number = sc.nextInt();

        String result;
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = Integer.toString(number);
        }

        // print result
        System.out.println(result);
    }
}
