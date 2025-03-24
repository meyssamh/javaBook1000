package _6__addition_and_reverse;

// Write a program that reads a two-digit number 
// and prints the sum of the digits and its reverce.

import java.util.Scanner;

public class AdditionAndReverce {
    public static void main(String[] args) {
        System.out.println("Please enter a two digits number:");
        
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();

            int firstDigit = number / 10;
            int secondDigit = number % 10;

            int addition = firstDigit + secondDigit;
            int reverse = secondDigit * 10 + firstDigit;

            System.out.println("The addition of numbers is equal " + addition +
                    " and the reverse of the number is  equal to " + reverse + ".");

            // System.out.printf("The addition of numbers is equal %1$s and the reverse of
            // the number is equal to %2$s%3$s.",
            // addition, secondDigit, firstDigit);
        }
    }
}