package com.msb.Part2ObjectedOrientedProgramming._2Classes._7Encapsulation;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
