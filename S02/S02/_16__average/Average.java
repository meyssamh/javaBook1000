package _16__average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = getUserInput("Enter amount of numbers:", scanner);

        if (amount <= 0) {
            System.out.println("Number of values must be greater than zero.");
            return;
        }

        int sum = calculateSum(scanner, amount);

        scanner.close();

        float average = (float) sum / amount;
        printOutput(sum, average);
    }

    private static int getUserInput(String message, Scanner scanner) {
        System.out.println(message);
        return inputValidator(scanner);
    }

    private static int calculateSum(Scanner scanner, int amount) {
        int sum = 0;

        for (int i = 0; i < amount; i++) {
            sum += getUserInput("Enter a number:", scanner);
        }

        return sum;
    }

    private static int inputValidator(Scanner scanner) {
        int input = 0;

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter an integer:");
                scanner.next();
            } else {
                input = scanner.nextInt();
                break;
            }
        }

        return input;
    }

    private static void printOutput(int sum, float average) {
        System.out.printf("Sum of numbers is equal to: %d.\n", sum);
        System.out.printf("The average of numbers is equal to : %.2f.\n", average);
    }
}