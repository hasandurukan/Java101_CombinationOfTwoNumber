package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1, number2;
        Scanner input = new Scanner(System.in);

        System.out.print("Please type first number :");
        number1 = input.nextInt();

        System.out.print("Please type second number :");
        number2 = input.nextInt();

        if (number1 < number2 || number1 < 0 || number2 < 0) {
            System.out.print("Make sure firstNumber >= secondNumber >= 0");
            System.exit(0);
        }

        double combination = 0;
        int factorialOfNumber1 = 1, factorialOfNumber2 = 1, factorialOfDiff = 1;
        int factorialBase = 1;
        for (int i = 1; i <= number1 || i <= number1 || (i < (number1 - number2)); i++) {
            factorialBase *= i;
            if (i == number1) {
                factorialOfNumber1 = factorialBase;
            } else if (i == number2) {
                factorialOfNumber2 = factorialBase;
            } else if (i == (number1 - number2)) {
                factorialOfDiff = factorialBase;
            }
        }

        combination = factorialOfNumber1 / (factorialOfNumber2 * factorialOfDiff);

        System.out.print("Combination of " + number1 + " and " + number2 + " is " + combination);
    }
}
