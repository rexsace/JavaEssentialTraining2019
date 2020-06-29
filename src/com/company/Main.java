package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        double d1 = getInput(sc);
        double d2 = getInput(sc);
        String op = getOperation(sc);
        doOperation(d1, d2, op);
    }

    private static double getInput(Scanner sc) {
        System.out.print("Enter a numeric value: ");
        double input = 0;
        try {
            input = sc.nextDouble();
        }  catch (InputMismatchException e) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        return input;
    }

    private static String getOperation(Scanner sc) {
        System.out.print("Select an operation (+ - * /): ");
        String op = null;
        try {
            op = sc.next("[+*/-]");
        } catch (InputMismatchException e){
            System.out.println("Invalid character for operation.");
            System.exit(0);
        }
        return op;
    }

    private static void doOperation(double d1, double d2, String op) {
        double result = 0;
        switch (op) {
            case "+":
                result = d1 + d2;
                break;
            case "-":
                result = d1 - d2;
                break;
            case "*":
                result = d1 * d2;
                break;
            case "/":
                result = d1 / d2;
                break;
        }
        System.out.println("The answer is " + result);
    }
}

