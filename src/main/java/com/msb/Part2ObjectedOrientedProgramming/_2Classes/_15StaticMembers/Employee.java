package com.msb.Part2ObjectedOrientedProgramming._2Classes._15StaticMembers;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    private static int numberOfEmployees;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage() {
        return calculateWage(0);
    }


    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }


    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void printNumberOfEmployees() {
        System.out.println("No. of Employees: " + numberOfEmployees);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        }
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less.");
        }
        this.hourlyRate = hourlyRate;
    }

}
