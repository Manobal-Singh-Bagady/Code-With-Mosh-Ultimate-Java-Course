package com.msb.Part2ObjectedOrientedProgramming._2Classes._12Constructors;


public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
