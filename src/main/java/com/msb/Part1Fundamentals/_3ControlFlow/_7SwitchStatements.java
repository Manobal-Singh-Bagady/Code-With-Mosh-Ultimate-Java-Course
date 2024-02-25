package com.msb.Part1Fundamentals._3ControlFlow;

import java.util.Scanner;

public class _7SwitchStatements {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String role = sc.nextLine();
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }
}
