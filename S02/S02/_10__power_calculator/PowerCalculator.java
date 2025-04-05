package _10__power_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = userInput(scanner, "Enter the base: ");
        int exponent = userInput(scanner, "Enter the exponent: ");

        scanner.close();

        int powerResult = calculatePowerWithoutMultiplication(base, exponent);

        printOutput(base, exponent, powerResult);
    }

    private static int userInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input < 0 && prompt.toLowerCase().contains("exponent")) {
                    System.out.println("Negative exponents are not supported in this calculator.");
                    continue;
                }
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer:");
                scanner.next();
            }
        }
    }

    private static int calculatePowerWithoutMultiplication(int base, int exponent) {
        if (exponent == 0)
            return 1;

        int result = base;
        for (int i = 1; i < exponent; i++) {
            result = addRepeatedly(result, base);
        }

        return result;
    }

    private static int addRepeatedly(int a, int times) {
        int sum = 0;
        for (int i = 0; i < times; i++) {
            sum += a;
        }
        return sum;
    }

    private static void printOutput(int base, int exponent, int result) {
        System.out.printf("%d ^ %d = %d%n", base, exponent, result);
    }
}