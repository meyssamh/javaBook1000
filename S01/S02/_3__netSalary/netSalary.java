package _3__netSalary;

// Write a program that reads an employee's salary,
// calculates and displays his insurance, taxes, and net salary.
// Insurance and taxes are 7% and 10% of the salary, respectively.

import java.util.Scanner;

public class netSalary {
    public static void main(String[] args) {
        System.out.println("Please enter your salary:");

        try (Scanner scanner = new Scanner(System.in)) {
            double salary = scanner.nextDouble();

            double taxAmount = salary * 0.1;
            double insuranceAmount = salary * 0.07;
            double netSalary = salary - taxAmount - insuranceAmount;

            System.out.println("Your tax amount is " + taxAmount +
                    ", your insurance amount is " + insuranceAmount +
                    " and your net salary is " + netSalary + ".");
        }
    }
}