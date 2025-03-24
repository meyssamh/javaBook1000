package _11__calculator;

// Write a program that reads the value x from the
// input and calculates the opposite result:
// y = 1 / (x^2 + x + 1)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please enter the value of x:");

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        scanner.close();

        double denominator = x * x + x + 1;

        double y = 1 / denominator;

        System.out.println("The result of y is " + y + ".");
    }
}