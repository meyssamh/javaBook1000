package _16__areaCalculator;

// Write a program that reads the height and base of a
// triangle from the input, calculates and displays its area.

import java.util.Scanner;

public class areaClaculator {
    public static void main(String[] args) {
        System.out.println("Please enter the height and the base of teh triangle:");

        Scanner scanner = new Scanner(System.in);

        double height = scanner.nextDouble();
        double base = scanner.nextDouble();

        scanner.close();

        double area = height * base * 0.5;

        System.out.println("The area of the triangle is equal to: " + area + ".");
    }
}