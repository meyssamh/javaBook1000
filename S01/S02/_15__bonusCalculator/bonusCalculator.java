package _15__bonusCalculator;

// If an employee receives a bonus equal to 15% of
// their previous month's salary, write a program 
// that reads the employee's salary, calculates and 
// displays his bonus.

import java.util.Scanner;

public class bonusCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of your salary:");

        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();

        scanner.close();

        double bonus = salary * 0.15;

        System.out.println("Your bonus is equal to: " + bonus + ".");
    }
}