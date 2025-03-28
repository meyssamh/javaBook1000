package _7__number_sorter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int firstNumber = getUserInput(scanner);
        int secondNumber = getUserInput(scanner);
        int thirdNumber = getUserInput(scanner);

        scanner.close();

        int temp;

        if (firstNumber > secondNumber) {
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        if (firstNumber > thirdNumber) {
            temp = firstNumber;
            firstNumber = thirdNumber;
            thirdNumber = temp;
        }
        if (secondNumber > thirdNumber) {
            temp = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = temp;
        }

        printResult(firstNumber, secondNumber, thirdNumber);
    }

    public static Integer getUserInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer:");
                scanner.next();
            }
        }
    }

    public static void printResult(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.printf("Sorted numbers: %d %d %d",
                firstNumber,
                secondNumber,
                thirdNumber);
    }
}