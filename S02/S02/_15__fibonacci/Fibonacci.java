package _15__fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int input = userInput();

        printOutput(input);
    }

    private static int userInput() {
        System.out.println("Enter a number:");

        return inputValidator();
    }

    private static int inputValidator() {
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number:");
                scanner.next();
            } else {
                input = scanner.nextInt();
                break;
            }
        }

        scanner.close();

        return input;
    }

    private static boolean isFibonacci(int input) {
        if (input == 0 || input == 1) return true;
    
        int firstFibonacci = 0;
        int secondFibonacci = 1;
        int currentFibonacci = 1;

        while (currentFibonacci < input) {
            currentFibonacci = firstFibonacci + secondFibonacci;
            firstFibonacci = secondFibonacci;
            secondFibonacci = currentFibonacci;
        }

        return currentFibonacci == input;
    }
    

    private static void printOutput(int input) {
        if (isFibonacci(input)) {
            System.out.println("The entered number is a fibonacci number.");
        } else {
            System.out.println("The entered number is not a fibonacci number.");
        }
    }
}