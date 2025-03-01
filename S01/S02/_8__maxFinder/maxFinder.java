package _8__maxFinder;

// Write a program that reads 3 numbers and 
// displays the largest number. Use the ? operator
// to solve this problem.

import java.util.Scanner;

public class maxFinder {
    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers:");

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        scanner.close();

        int max = firstNumber > secondNumber
                ? firstNumber > thirdNumber
                        ? firstNumber
                        : thirdNumber
                : secondNumber > thirdNumber
                        ? secondNumber
                        : thirdNumber;

        System.out.println("The highest number is " + max + ".");
    }
}