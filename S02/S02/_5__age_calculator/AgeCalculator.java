package _5__age_calculator;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = getUserInput(scanner, "Enter your birth year:");
        int birthMonth = getUserInput(scanner, "Enter your birth month:");
        int birthDay = getUserInput(scanner, "Enter your birth day:");

        int currentYear = getUserInput(scanner, "Enter current year:");
        int currentMonth = getUserInput(scanner, "Enter current month:");
        int currentDay = getUserInput(scanner, "Enter current day:");

        scanner.close();

        int[] age = calculateAge(birthYear, birthMonth, birthDay, currentYear, currentMonth, currentDay);

        System.out.println("You have lived for " + age[0] + " years, "
                + age[1] + " months, and " + age[2] + " days.");
    }

    private static int getUserInput(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    private static int[] calculateAge(int birthYear, int birthMonth, int birthDay,
            int currentYear, int currentMonth, int currentDay) {
        if (currentDay < birthDay) {
            currentMonth--;
            currentDay += 30;
        }
        int day = currentDay - birthDay;

        if (currentMonth < birthMonth) {
            currentYear--;
            currentMonth += 12;
        }
        int month = currentMonth - birthMonth;

        int year = currentYear - birthYear;

        return new int[] { year, month, day };
    }
}