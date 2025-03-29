package _8__salary_calculator;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workersAmount = getUserInput(scanner, "Enter the amount of workers:");

        for (int i = 0; i < workersAmount; i++) {
            int workerId = getUserInput(scanner, "Enter worker ID:");
            int workedHour = getUserInput(scanner, "Enter hours he/she worked:");
            int hourlyWage = getUserInput(scanner, "Enter his/her hourly wage:");

            Worker worker = new Worker(workerId, workedHour, hourlyWage);
            System.out.println(worker);
        }

        scanner.close();
    }

    public static int getUserInput(Scanner scanner, String message) {
        int input;
        do {
            System.out.println(message);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input < 0);
        return input;
    }
}