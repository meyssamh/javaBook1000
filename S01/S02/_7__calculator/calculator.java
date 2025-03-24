package _7__calculator;

// Write a program that reads x and calculates 
// the following expression without using the 
// multiplication operator:
// y = 31 * x - 17 * x + 5

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please enter a number for x:");
        
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();

            int firstPart = (x << 5) - x;
            int secondPart = -((x << 4) + x);

            int result = firstPart + secondPart + 5;

            System.out.println("The result of expression with x equal to " + x +
                    " is equal to " + result + ".");
        }
    }
}